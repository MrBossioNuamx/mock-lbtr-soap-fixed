
package pe.bcrp.lbtr.ws.auth;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.bcrp.lbtr.ws.auth package. 
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

    private final static QName _LBTRSessionFault_QNAME = new QName("http://lbtr.bcrp.gob.pe", "LBTRSessionFault");
    private final static QName _FaultInfo_QNAME = new QName("http://lbtr.bcrp.gob.pe", "faultInfo");
    private final static QName _Logoff_QNAME = new QName("http://lbtr.bcrp.gob.pe", "logoff");
    private final static QName _LogoffResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "logoffResponse");
    private final static QName _Logon_QNAME = new QName("http://lbtr.bcrp.gob.pe", "logon");
    private final static QName _LogonResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "logonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.bcrp.lbtr.ws.auth
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
     * Create an instance of {@link Logoff }
     * 
     */
    public Logoff createLogoff() {
        return new Logoff();
    }

    /**
     * Create an instance of {@link LogoffResponse }
     * 
     */
    public LogoffResponse createLogoffResponse() {
        return new LogoffResponse();
    }

    /**
     * Create an instance of {@link Logon }
     * 
     */
    public Logon createLogon() {
        return new Logon();
    }

    /**
     * Create an instance of {@link LogonResponse }
     * 
     */
    public LogonResponse createLogonResponse() {
        return new LogonResponse();
    }

    /**
     * Create an instance of {@link BaseObject }
     * 
     */
    public BaseObject createBaseObject() {
        return new BaseObject();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Logoff }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Logoff }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "logoff")
    public JAXBElement<Logoff> createLogoff(Logoff value) {
        return new JAXBElement<Logoff>(_Logoff_QNAME, Logoff.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoffResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogoffResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "logoffResponse")
    public JAXBElement<LogoffResponse> createLogoffResponse(LogoffResponse value) {
        return new JAXBElement<LogoffResponse>(_LogoffResponse_QNAME, LogoffResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logon }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Logon }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "logon")
    public JAXBElement<Logon> createLogon(Logon value) {
        return new JAXBElement<Logon>(_Logon_QNAME, Logon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "logonResponse")
    public JAXBElement<LogonResponse> createLogonResponse(LogonResponse value) {
        return new JAXBElement<LogonResponse>(_LogonResponse_QNAME, LogonResponse.class, null, value);
    }

}
