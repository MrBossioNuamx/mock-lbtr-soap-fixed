
package pe.bcrp.lbtr.ws.transferencia;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.bcrp.lbtr.ws.transferencia package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LBTRServiceFault_QNAME = new QName("http://lbtr.bcrp.gob.pe", "LBTRServiceFault");
    private final static QName _LBTRSessionFault_QNAME = new QName("http://lbtr.bcrp.gob.pe", "LBTRSessionFault");
    private final static QName _ConfirmarAbonoCliente_QNAME = new QName("http://lbtr.bcrp.gob.pe", "confirmarAbonoCliente");
    private final static QName _ConfirmarAbonoClienteResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "confirmarAbonoClienteResponse");
    private final static QName _FaultInfo_QNAME = new QName("http://lbtr.bcrp.gob.pe", "faultInfo");
    private final static QName _InstruirTransferencia_QNAME = new QName("http://lbtr.bcrp.gob.pe", "instruirTransferencia");
    private final static QName _InstruirTransferenciaCavali_QNAME = new QName("http://lbtr.bcrp.gob.pe", "instruirTransferenciaCavali");
    private final static QName _InstruirTransferenciaCavaliResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "instruirTransferenciaCavaliResponse");
    private final static QName _InstruirTransferenciaResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "instruirTransferenciaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.bcrp.lbtr.ws.transferencia
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultInfo }
     * 
     */
    public FaultInfo createFaultInfo() {
        return new FaultInfo();
    }

    /**
     * Create an instance of {@link ConfirmarAbonoCliente }
     * 
     */
    public ConfirmarAbonoCliente createConfirmarAbonoCliente() {
        return new ConfirmarAbonoCliente();
    }

    /**
     * Create an instance of {@link ConfirmarAbonoClienteResponse }
     * 
     */
    public ConfirmarAbonoClienteResponse createConfirmarAbonoClienteResponse() {
        return new ConfirmarAbonoClienteResponse();
    }

    /**
     * Create an instance of {@link InstruirTransferencia }
     * 
     */
    public InstruirTransferencia createInstruirTransferencia() {
        return new InstruirTransferencia();
    }

    /**
     * Create an instance of {@link InstruirTransferenciaCavali }
     * 
     */
    public InstruirTransferenciaCavali createInstruirTransferenciaCavali() {
        return new InstruirTransferenciaCavali();
    }

    /**
     * Create an instance of {@link InstruirTransferenciaCavaliResponse }
     * 
     */
    public InstruirTransferenciaCavaliResponse createInstruirTransferenciaCavaliResponse() {
        return new InstruirTransferenciaCavaliResponse();
    }

    /**
     * Create an instance of {@link InstruirTransferenciaResponse }
     * 
     */
    public InstruirTransferenciaResponse createInstruirTransferenciaResponse() {
        return new InstruirTransferenciaResponse();
    }

    /**
     * Create an instance of {@link DatosTransferencia }
     * 
     */
    public DatosTransferencia createDatosTransferencia() {
        return new DatosTransferencia();
    }

    /**
     * Create an instance of {@link BaseObject }
     * 
     */
    public BaseObject createBaseObject() {
        return new BaseObject();
    }

    /**
     * Create an instance of {@link DatosCavali }
     * 
     */
    public DatosCavali createDatosCavali() {
        return new DatosCavali();
    }

    /**
     * Create an instance of {@link RespuestaLBTR }
     * 
     */
    public RespuestaLBTR createRespuestaLBTR() {
        return new RespuestaLBTR();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "LBTRServiceFault")
    public JAXBElement<FaultInfo> createLBTRServiceFault(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_LBTRServiceFault_QNAME, FaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "LBTRSessionFault")
    public JAXBElement<FaultInfo> createLBTRSessionFault(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_LBTRSessionFault_QNAME, FaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmarAbonoCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfirmarAbonoCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "confirmarAbonoCliente")
    public JAXBElement<ConfirmarAbonoCliente> createConfirmarAbonoCliente(ConfirmarAbonoCliente value) {
        return new JAXBElement<ConfirmarAbonoCliente>(_ConfirmarAbonoCliente_QNAME, ConfirmarAbonoCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmarAbonoClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfirmarAbonoClienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "confirmarAbonoClienteResponse")
    public JAXBElement<ConfirmarAbonoClienteResponse> createConfirmarAbonoClienteResponse(ConfirmarAbonoClienteResponse value) {
        return new JAXBElement<ConfirmarAbonoClienteResponse>(_ConfirmarAbonoClienteResponse_QNAME, ConfirmarAbonoClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "faultInfo")
    public JAXBElement<FaultInfo> createFaultInfo(FaultInfo value) {
        return new JAXBElement<FaultInfo>(_FaultInfo_QNAME, FaultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstruirTransferencia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InstruirTransferencia }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "instruirTransferencia")
    public JAXBElement<InstruirTransferencia> createInstruirTransferencia(InstruirTransferencia value) {
        return new JAXBElement<InstruirTransferencia>(_InstruirTransferencia_QNAME, InstruirTransferencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstruirTransferenciaCavali }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InstruirTransferenciaCavali }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "instruirTransferenciaCavali")
    public JAXBElement<InstruirTransferenciaCavali> createInstruirTransferenciaCavali(InstruirTransferenciaCavali value) {
        return new JAXBElement<InstruirTransferenciaCavali>(_InstruirTransferenciaCavali_QNAME, InstruirTransferenciaCavali.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstruirTransferenciaCavaliResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InstruirTransferenciaCavaliResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "instruirTransferenciaCavaliResponse")
    public JAXBElement<InstruirTransferenciaCavaliResponse> createInstruirTransferenciaCavaliResponse(InstruirTransferenciaCavaliResponse value) {
        return new JAXBElement<InstruirTransferenciaCavaliResponse>(_InstruirTransferenciaCavaliResponse_QNAME, InstruirTransferenciaCavaliResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstruirTransferenciaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InstruirTransferenciaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "instruirTransferenciaResponse")
    public JAXBElement<InstruirTransferenciaResponse> createInstruirTransferenciaResponse(InstruirTransferenciaResponse value) {
        return new JAXBElement<InstruirTransferenciaResponse>(_InstruirTransferenciaResponse_QNAME, InstruirTransferenciaResponse.class, null, value);
    }

}
