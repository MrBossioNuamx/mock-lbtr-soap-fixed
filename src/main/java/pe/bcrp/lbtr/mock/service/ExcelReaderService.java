package pe.bcrp.lbtr.mock.service;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pe.bcrp.lbtr.ws.consultas.BeanOperacion;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class ExcelReaderService {

    private final String excelPath;
    private final String authFile;
    private final String sessionsFile;
    private final String operacionesRecibidasFile;
    private final long sessionTTLMillis;
    private final DataFormatter dataFormatter = new DataFormatter();

    public ExcelReaderService(
            @Value("${excel.path}") String excelPath,
            @Value("${excel.authFile}") String authFile,
            @Value("${excel.sessionsFile}") String sessionsFile,
            @Value("${excel.operacionesRecibidasFile}") String operacionesRecibidasFile,
            @Value("${mock.sessionTTLMinutes}") long sessionTTLMinutes) {
        this.excelPath = excelPath;
        this.authFile = authFile;
        this.sessionsFile = sessionsFile;
        this.operacionesRecibidasFile = operacionesRecibidasFile;
        this.sessionTTLMillis = TimeUnit.MINUTES.toMillis(sessionTTLMinutes);
    }

    public boolean authenticate(String codigo, String password, String ksim, String firma) {
        File file = new File(excelPath, authFile);
        try (FileInputStream fis = new FileInputStream(file);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row != null && Objects.equals(getCellValueAsString(row.getCell(0)), codigo) && Objects.equals(getCellValueAsString(row.getCell(1)), password) && Objects.equals(getCellValueAsString(row.getCell(2)), ksim) && Objects.equals(getCellValueAsString(row.getCell(3)), firma)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public synchronized String createSession(String codigo) {
        String sessionId = UUID.randomUUID().toString();
        long expirationTimestamp = System.currentTimeMillis() + sessionTTLMillis;
        File file = new File(excelPath, sessionsFile);
        try (FileInputStream fis = new FileInputStream(file);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            int newRowNum = sheet.getLastRowNum() + 1;
            Row newRow = sheet.createRow(newRowNum);
            newRow.createCell(0).setCellValue(codigo);
            newRow.createCell(1).setCellValue(sessionId);
            newRow.createCell(2).setCellValue(expirationTimestamp);
            try (FileOutputStream fos = new FileOutputStream(file)) {
                workbook.write(fos);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return sessionId;
    }

    public synchronized boolean invalidateSessions(String userCode) {
        File file = new File(excelPath, sessionsFile);
        boolean sessionsInvalidated = false;
        try (FileInputStream fis = new FileInputStream(file);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row != null && Objects.equals(getCellValueAsString(row.getCell(0)), userCode)) {
                    Cell expirationCell = row.getCell(2, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    expirationCell.setCellValue(0);
                    sessionsInvalidated = true;
                }
            }
            if (sessionsInvalidated) {
                try (FileOutputStream fos = new FileOutputStream(file)) {
                    workbook.write(fos);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return sessionsInvalidated;
    }

    public boolean isSessionValid(String sessionId) {
        return getUserCodeForSession(sessionId) != null;
    }

    public String getUserCodeForSession(String sessionId) {
        File file = new File(excelPath, sessionsFile);
        try (FileInputStream fis = new FileInputStream(file);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row != null && Objects.equals(getCellValueAsString(row.getCell(1)), sessionId)) {
                    long expirationTimestamp = (long) row.getCell(2).getNumericCellValue();
                    if (System.currentTimeMillis() < expirationTimestamp) {
                        return getCellValueAsString(row.getCell(0));
                    } else {
                        return null;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getFirmaForUser(String userCode) {
        File file = new File(excelPath, authFile);
        try (FileInputStream fis = new FileInputStream(file);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row != null && Objects.equals(getCellValueAsString(row.getCell(0)), userCode)) {
                    return getCellValueAsString(row.getCell(3));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<BeanOperacion> getOperacionesRecibidas(XMLGregorianCalendar fechaLiquidacion) throws IOException {
        if (fechaLiquidacion == null) {
            return Collections.emptyList();
        }
        List<BeanOperacion> operations = new ArrayList<>();
        File file = new File(excelPath, operacionesRecibidasFile);
        Date requestedJavaDate = fechaLiquidacion.toGregorianCalendar().getTime();
        String requestedDate = new SimpleDateFormat("yyyy-MM-dd").format(requestedJavaDate);
        System.out.println("--- Checking for operations on requested date: " + requestedDate + " ---");

        try (FileInputStream fis = new FileInputStream(file);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row == null) continue;
                
                String excelFecha = getCellValueAsDateString(row.getCell(11));
                
                System.out.println("Row " + (i + 1) + ": Read date as '"+ excelFecha + "'. Comparing to '" + requestedDate + "'. Match: " + Objects.equals(excelFecha, requestedDate));
                
                if (Objects.equals(excelFecha, requestedDate)) {
                    BeanOperacion op = new BeanOperacion();
                    op.setCodBancoDestino(getCellValueAsString(row.getCell(0)));
                    op.setCodBancoOrigen(getCellValueAsString(row.getCell(1)));
                    op.setCodConcepto(getCellValueAsString(row.getCell(2)));
                    op.setCodMoneda(getCellValueAsString(row.getCell(3)));
                    op.setCodigoSAB(getCellValueAsString(row.getCell(4)));
                    op.setConfirmaAbono(getCellValueAsString(row.getCell(5)));
                    op.setCuentaDestino(getCellValueAsString(row.getCell(6)));
                    op.setCuentaInterbancariaSAB(getCellValueAsString(row.getCell(7)));
                    op.setCuentaOrigen(getCellValueAsString(row.getCell(8)));
                    op.setDatosCliente(getCellValueAsString(row.getCell(9)));
                    op.setEstadoLiquidacion(getCellValueAsString(row.getCell(10)));
                    op.setFechaLiquidacion(getCellValueAsXMLGregorianCalendar(row.getCell(11)));
                    op.setFechaNegociacionCavali(getCellValueAsXMLGregorianCalendar(row.getCell(12)));
                    op.setHoraLiquidacion(getCellValueAsString(row.getCell(13)));
                    op.setInstruccionesPago(getCellValueAsString(row.getCell(14)));
                    op.setMontoOperacion(getCellValueAsBigDecimal(row.getCell(15)));
                    op.setNumRefCavali(getCellValueAsString(row.getCell(16)));
                    op.setNumRefEnlaceOperacion(getCellValueAsString(row.getCell(17)));
                    op.setNumRefLBTR(getCellValueAsString(row.getCell(18)));
                    op.setNumRefOrigen(getCellValueAsString(row.getCell(19)));
                    op.setPrioridad(getCellValueAsInteger(row.getCell(20)));
                    op.setTipoCambio(getCellValueAsBigDecimal(row.getCell(21)));
                    op.setTipoParticipanteCavali(getCellValueAsString(row.getCell(22)));
                    operations.add(op);
                }
            }
        }
        System.out.println("--- Found " + operations.size() + " operations for requested date. ---");
        return operations;
    }

    private String getCellValueAsString(Cell cell) {
        if (cell == null) return "";
        String value = dataFormatter.formatCellValue(cell);
        return "empty".equalsIgnoreCase(value) ? "" : value;
    }

    private String getCellValueAsDateString(Cell cell) {
        if (cell == null) return "";
        if (cell.getCellType() == CellType.NUMERIC && DateUtil.isCellDateFormatted(cell)) {
            return new SimpleDateFormat("yyyy-MM-dd").format(cell.getDateCellValue());
        }
        // Fallback: try to parse string date
        String value = dataFormatter.formatCellValue(cell);
        try {
            // Try parsing yyyy-MM-dd
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(value);
            return new SimpleDateFormat("yyyy-MM-dd").format(date);
        } catch (ParseException e) {
            return value;
        }
    }

    private BigDecimal getCellValueAsBigDecimal(Cell cell) {
        if (cell == null) return null;
        if (cell.getCellType() == CellType.NUMERIC) {
            return new BigDecimal(cell.getNumericCellValue());
        }
        if (cell.getCellType() == CellType.STRING) {
            String value = cell.getStringCellValue();
            if ("empty".equalsIgnoreCase(value)) return null;
            try {
                return new BigDecimal(value);
            } catch (NumberFormatException e) { return null; }
        }
        return null;
    }

    private Integer getCellValueAsInteger(Cell cell) {
        if (cell == null) return null;
        if (cell.getCellType() == CellType.NUMERIC) {
            return (int) cell.getNumericCellValue();
        }
        if (cell.getCellType() == CellType.STRING) {
            String value = cell.getStringCellValue();
            if ("empty".equalsIgnoreCase(value)) return null;
            try {
                return Integer.parseInt(value);
            } catch (NumberFormatException e) { return null; }
        }
        return null;
    }

    private XMLGregorianCalendar getCellValueAsXMLGregorianCalendar(Cell cell) {
        if (cell == null) return null;
        Date date = null;

        if (cell.getCellType() == CellType.NUMERIC && DateUtil.isCellDateFormatted(cell)) {
            date = cell.getDateCellValue();
        } else if (cell.getCellType() == CellType.STRING) {
            String value = cell.getStringCellValue();
            if ("empty".equalsIgnoreCase(value)) return null;
            try {
                // Try parsing standard ISO date format
                date = new SimpleDateFormat("yyyy-MM-dd").parse(value);
            } catch (ParseException e) {
                // Ignore parsing errors
            }
        }

        if (date != null) {
            try {
                GregorianCalendar cal = new GregorianCalendar();
                cal.setTime(date);
                return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
