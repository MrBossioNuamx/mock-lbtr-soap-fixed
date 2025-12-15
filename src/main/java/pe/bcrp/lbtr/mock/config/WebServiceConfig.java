package pe.bcrp.lbtr.mock.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.bcrp.lbtr.mock.endpoints.AutenticacionEndpoint;
import pe.bcrp.lbtr.mock.endpoints.ConsultasEndpoint;
import pe.bcrp.lbtr.mock.endpoints.TransferenciaEndpoint;

import javax.xml.ws.Endpoint;

@Configuration
public class WebServiceConfig {

    @Autowired
    private Bus bus;

    @Autowired
    private AutenticacionEndpoint autenticacionEndpoint;

    @Autowired
    private ConsultasEndpoint consultasEndpoint;

    @Autowired
    private TransferenciaEndpoint transferenciaEndpoint;

    @Bean
    public Endpoint autenticacionService() {
        EndpointImpl endpoint = new EndpointImpl(bus, autenticacionEndpoint);
        // Final URL: /soap/auth
        endpoint.publish("/auth");
        return endpoint;
    }

    @Bean
    public Endpoint consultasService() {
        EndpointImpl endpoint = new EndpointImpl(bus, consultasEndpoint);
        // Final URL: /soap/consultas
        endpoint.publish("/consultas");
        return endpoint;
    }

    @Bean
    public Endpoint transferenciaService() {
        EndpointImpl endpoint = new EndpointImpl(bus, transferenciaEndpoint);
        // Final URL: /soap/transferencia
        endpoint.publish("/transferencia");
        return endpoint;
    }
}
