package pe.bcrp.lbtr.mock.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.bcrp.lbtr.mock.service.ExcelReaderService;
import pe.bcrp.lbtr.ws.transferencia.DatosCavali;
import pe.bcrp.lbtr.ws.transferencia.DatosTransferencia;
import pe.bcrp.lbtr.ws.transferencia.LBTRServiceException;
import pe.bcrp.lbtr.ws.transferencia.LBTRSessionException;
import pe.bcrp.lbtr.ws.transferencia.LBTRTransferenciaService;
import pe.bcrp.lbtr.ws.transferencia.RespuestaLBTR;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class TransferenciaEndpoint implements LBTRTransferenciaService {

    private final ExcelReaderService excelReaderService;

    @Autowired
    public TransferenciaEndpoint(ExcelReaderService excelReaderService) {
        this.excelReaderService = excelReaderService;
    }

    @Override
    public RespuestaLBTR instruirTransferenciaCavali(String sid, DatosTransferencia datosTransferencia, DatosCavali datosCavali, String firma) throws LBTRSessionException, LBTRServiceException {

        System.out.println("\n--- Current Local DateTime: " + LocalDateTime.now() + " ---");
        System.out.println(">>> instruirTransferenciaCavali request received for session: " + sid);

        // Step 1: Validate session and get the associated user code
        String userCode = excelReaderService.getUserCodeForSession(sid);
        if (userCode == null) {
            throw new LBTRSessionException("Invalid or expired session ID.");
        }
        System.out.println(">>> Session is valid for user: " + userCode);

        // Step 2: Get the expected signature for that user
        String expectedFirma = excelReaderService.getFirmaForUser(userCode);

        // Step 3: Validate the signature from the request
        if (!Objects.equals(firma, expectedFirma)) {
            System.err.println(">>> Signature validation failed. Expected: '" + expectedFirma + "', but received: '" + firma + "'");
            throw new LBTRServiceException("Signature validation failed.");
        }
        System.out.println(">>> Signature validated successfully.");

        // Step 4: Print the received data to the console
        System.out.println("--- DatosTransferencia Received ---");
        System.out.println(datosTransferencia.toString());
        System.out.println("------------------------------------");

        System.out.println("--- DatosCavali Received ---");
        System.out.println(datosCavali.toString());
        System.out.println("----------------------------");

        // Step 5: Return a successful mock response
        RespuestaLBTR response = new RespuestaLBTR();
        response.setEstado("OK - Transferencia Cavali instruida exitosamente (Mock).");
        response.setNumRefLBTR("MOCK-LBTR-" + System.currentTimeMillis());

        return response;
    }

    // ... (other empty methods are unchanged) ...
    @Override
    public RespuestaLBTR instruirTransferencia(String sid, DatosTransferencia datosTransferencia, String firma) throws LBTRSessionException, LBTRServiceException {
        throw new LBTRServiceException("This operation is not implemented in the mock.");
    }

    @Override
    public RespuestaLBTR confirmarAbonoCliente(String sid, String numRefLBTR, String firma) throws LBTRSessionException, LBTRServiceException {
        throw new LBTRServiceException("This operation is not implemented in the mock.");
    }
}
