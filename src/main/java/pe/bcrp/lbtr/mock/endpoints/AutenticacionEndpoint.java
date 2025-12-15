package pe.bcrp.lbtr.mock.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.bcrp.lbtr.mock.service.ExcelReaderService;
import pe.bcrp.lbtr.ws.auth.LBTRAutenticacionService;
import pe.bcrp.lbtr.ws.auth.LBTRSessionException;

import java.time.LocalDateTime;

@Service
public class AutenticacionEndpoint implements LBTRAutenticacionService {

    private final ExcelReaderService excelReaderService;

    @Autowired
    public AutenticacionEndpoint(ExcelReaderService excelReaderService) {
        this.excelReaderService = excelReaderService;
    }

    @Override
    public String logon(String codigo, String password, String ksim, String firma) throws LBTRSessionException {
        System.out.println("\n--- Current Local DateTime: " + LocalDateTime.now() + " ---");
        System.out.println(">>> Logon request received for user: " + codigo);

        boolean isAuthenticated = excelReaderService.authenticate(codigo, password, ksim, firma);

        if (isAuthenticated) {
            System.out.println(">>> User " + codigo + " authenticated successfully.");
            String sessionId = excelReaderService.createSession(codigo);
            if (sessionId == null) {
                throw new LBTRSessionException("Failed to create and persist session.");
            }
            return sessionId;
        } else {
            System.err.println(">>> Authentication failed for user: " + codigo);
            throw new LBTRSessionException("Authentication failed: Invalid credentials.");
        }
    }

    @Override
    public boolean logoff(String codigo, String password, String ksim, String firma) throws LBTRSessionException {
        System.out.println(">>> Logoff request received for user: " + codigo);

        // We don't re-authenticate on logoff, just invalidate the sessions for the given user code.
        // The WSDL requires the extra parameters, but we only need the 'codigo'.
        boolean sessionsInvalidated = excelReaderService.invalidateSessions(codigo);

        if (sessionsInvalidated) {
            System.out.println(">>> Sessions for user " + codigo + " have been invalidated.");
        } else {
            System.out.println(">>> No active sessions found for user " + codigo + " to invalidate.");
        }

        // The operation returns true if the process was successful,
        // regardless of whether sessions were actually found.
        return true;
    }
}
