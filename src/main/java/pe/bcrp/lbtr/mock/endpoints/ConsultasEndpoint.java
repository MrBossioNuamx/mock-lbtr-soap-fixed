package pe.bcrp.lbtr.mock.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.bcrp.lbtr.mock.service.ExcelReaderService;
import pe.bcrp.lbtr.ws.consultas.BeanOperacion;
import pe.bcrp.lbtr.ws.consultas.LBTRConsultasService;
import pe.bcrp.lbtr.ws.consultas.LBTRServiceException;
import pe.bcrp.lbtr.ws.consultas.LBTRSessionException;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Service
public class ConsultasEndpoint implements LBTRConsultasService {

    private final ExcelReaderService excelReaderService;

    @Autowired
    public ConsultasEndpoint(ExcelReaderService excelReaderService) {
        this.excelReaderService = excelReaderService;
    }

    @Override
    public List<BeanOperacion> lbtrOperacionesRecibidas(String sid, XMLGregorianCalendar fechaLiquidacion) throws LBTRSessionException, LBTRServiceException {
        System.out.println("\n--- Current Local DateTime: " + LocalDateTime.now() + " ---");
        System.out.println(">>> lbtrOperacionesRecibidas request received for session: " + sid);

        // Step 1: Validate the session
        if (!excelReaderService.isSessionValid(sid)) {
            throw new LBTRSessionException("Invalid or expired session ID.");
        }

        // Step 2: Get operations for the requested date
        try {
            // Pass the date from the SOAP request to the service
            return excelReaderService.getOperacionesRecibidas(fechaLiquidacion);
        } catch (Exception e) {
            e.printStackTrace();
            throw new LBTRServiceException("An internal error occurred while fetching operations.");
        }
    }

    // ... (rest of the empty methods are unchanged) ...
    @Override
    public java.util.List<pe.bcrp.lbtr.ws.consultas.BeanMoneda> lbtrMonedas(java.lang.String sid) throws LBTRSessionException, LBTRServiceException {
        return Collections.emptyList();
    }
    @Override
    public pe.bcrp.lbtr.ws.consultas.BeanCobroTarifa lbtrCobroTarifa(String sid, String periodo) throws LBTRSessionException, LBTRServiceException {
        return null;
    }
    @Override
    public List<pe.bcrp.lbtr.ws.consultas.BeanAgenteBolsa> lbtrAgentesBolsa(String sid) throws LBTRSessionException, LBTRServiceException {
        return Collections.emptyList();
    }
    @Override
    public List<pe.bcrp.lbtr.ws.consultas.BeanEntidadFinanciera> lbtrEntidadesFinancieras(String sid) throws LBTRSessionException, LBTRServiceException {
        return Collections.emptyList();
    }
    @Override
    public List<pe.bcrp.lbtr.ws.consultas.BeanCuentaCorriente> lbtrCtasCtesEntidad(String sid, String institucionID) throws LBTRSessionException, LBTRServiceException {
        return Collections.emptyList();
    }
    @Override
    public List<pe.bcrp.lbtr.ws.consultas.BeanCompraVentaME> lbtrNegCompraVentaME(String sid, XMLGregorianCalendar fechaLiquidacion) throws LBTRSessionException, LBTRServiceException {
        return Collections.emptyList();
    }
    @Override
    public List<pe.bcrp.lbtr.ws.consultas.BeanSaldoCtaCte> lbtrSaldosCtaCte(String sid, String numCuenta, XMLGregorianCalendar fecha) throws LBTRSessionException, LBTRServiceException {
        return Collections.emptyList();
    }
    @Override
    public List<pe.bcrp.lbtr.ws.consultas.BeanFacilidadInstitucion> lbtrFacilidadesDisponibles(String sid) throws LBTRSessionException, LBTRServiceException {
        return Collections.emptyList();
    }
    @Override
    public List<pe.bcrp.lbtr.ws.consultas.BeanTipoCambio> lbtrTipoCambio(String sid, String codMoneda, XMLGregorianCalendar fecha) throws LBTRSessionException, LBTRServiceException {
        return Collections.emptyList();
    }
    @Override
    public List<pe.bcrp.lbtr.ws.consultas.BeanMovimientoCtaCte> lbtrMovimientosCtaCte(String sid, String numCuenta, XMLGregorianCalendar fecha) throws LBTRSessionException, LBTRServiceException {
        return Collections.emptyList();
    }
    @Override
    public List<pe.bcrp.lbtr.ws.consultas.BeanConceptoLiquidacion> lbtrConceptos(String sid) throws LBTRSessionException, LBTRServiceException {
        return Collections.emptyList();
    }
    @Override
    public List<pe.bcrp.lbtr.ws.consultas.BeanTarifa> lbtrTarifario(String sid) throws LBTRSessionException, LBTRServiceException {
        return Collections.emptyList();
    }
    @Override
    public List<BeanOperacion> lbtrOperacionesOtorgadas(String sid, XMLGregorianCalendar fechaLiquidacion) throws LBTRSessionException, LBTRServiceException {
        return Collections.emptyList();
    }
}
