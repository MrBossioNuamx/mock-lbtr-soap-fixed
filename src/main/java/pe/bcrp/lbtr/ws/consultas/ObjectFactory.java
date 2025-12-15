
package pe.bcrp.lbtr.ws.consultas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.bcrp.lbtr.ws.consultas package. 
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
    private final static QName _FaultInfo_QNAME = new QName("http://lbtr.bcrp.gob.pe", "faultInfo");
    private final static QName _LbtrAgentesBolsa_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_AgentesBolsa");
    private final static QName _LbtrAgentesBolsaResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_AgentesBolsaResponse");
    private final static QName _LbtrCobroTarifa_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_CobroTarifa");
    private final static QName _LbtrCobroTarifaResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_CobroTarifaResponse");
    private final static QName _LbtrConceptos_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_Conceptos");
    private final static QName _LbtrConceptosResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_ConceptosResponse");
    private final static QName _LbtrCtasCtesEntidad_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_CtasCtesEntidad");
    private final static QName _LbtrCtasCtesEntidadResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_CtasCtesEntidadResponse");
    private final static QName _LbtrEntidadesFinancieras_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_EntidadesFinancieras");
    private final static QName _LbtrEntidadesFinancierasResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_EntidadesFinancierasResponse");
    private final static QName _LbtrFacilidadesDisponibles_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_FacilidadesDisponibles");
    private final static QName _LbtrFacilidadesDisponiblesResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_FacilidadesDisponiblesResponse");
    private final static QName _LbtrMonedas_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_Monedas");
    private final static QName _LbtrMonedasResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_MonedasResponse");
    private final static QName _LbtrMovimientosCtaCte_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_MovimientosCtaCte");
    private final static QName _LbtrMovimientosCtaCteResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_MovimientosCtaCteResponse");
    private final static QName _LbtrNegCompraVentaME_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_NegCompraVentaME");
    private final static QName _LbtrNegCompraVentaMEResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_NegCompraVentaMEResponse");
    private final static QName _LbtrOperacionesOtorgadas_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_OperacionesOtorgadas");
    private final static QName _LbtrOperacionesOtorgadasResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_OperacionesOtorgadasResponse");
    private final static QName _LbtrOperacionesRecibidas_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_OperacionesRecibidas");
    private final static QName _LbtrOperacionesRecibidasResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_OperacionesRecibidasResponse");
    private final static QName _LbtrSaldosCtaCte_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_SaldosCtaCte");
    private final static QName _LbtrSaldosCtaCteResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_SaldosCtaCteResponse");
    private final static QName _LbtrTarifario_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_Tarifario");
    private final static QName _LbtrTarifarioResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_TarifarioResponse");
    private final static QName _LbtrTipoCambio_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_TipoCambio");
    private final static QName _LbtrTipoCambioResponse_QNAME = new QName("http://lbtr.bcrp.gob.pe", "lbtr_TipoCambioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.bcrp.lbtr.ws.consultas
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
     * Create an instance of {@link LbtrAgentesBolsa }
     * 
     */
    public LbtrAgentesBolsa createLbtrAgentesBolsa() {
        return new LbtrAgentesBolsa();
    }

    /**
     * Create an instance of {@link LbtrAgentesBolsaResponse }
     * 
     */
    public LbtrAgentesBolsaResponse createLbtrAgentesBolsaResponse() {
        return new LbtrAgentesBolsaResponse();
    }

    /**
     * Create an instance of {@link LbtrCobroTarifa }
     * 
     */
    public LbtrCobroTarifa createLbtrCobroTarifa() {
        return new LbtrCobroTarifa();
    }

    /**
     * Create an instance of {@link LbtrCobroTarifaResponse }
     * 
     */
    public LbtrCobroTarifaResponse createLbtrCobroTarifaResponse() {
        return new LbtrCobroTarifaResponse();
    }

    /**
     * Create an instance of {@link LbtrConceptos }
     * 
     */
    public LbtrConceptos createLbtrConceptos() {
        return new LbtrConceptos();
    }

    /**
     * Create an instance of {@link LbtrConceptosResponse }
     * 
     */
    public LbtrConceptosResponse createLbtrConceptosResponse() {
        return new LbtrConceptosResponse();
    }

    /**
     * Create an instance of {@link LbtrCtasCtesEntidad }
     * 
     */
    public LbtrCtasCtesEntidad createLbtrCtasCtesEntidad() {
        return new LbtrCtasCtesEntidad();
    }

    /**
     * Create an instance of {@link LbtrCtasCtesEntidadResponse }
     * 
     */
    public LbtrCtasCtesEntidadResponse createLbtrCtasCtesEntidadResponse() {
        return new LbtrCtasCtesEntidadResponse();
    }

    /**
     * Create an instance of {@link LbtrEntidadesFinancieras }
     * 
     */
    public LbtrEntidadesFinancieras createLbtrEntidadesFinancieras() {
        return new LbtrEntidadesFinancieras();
    }

    /**
     * Create an instance of {@link LbtrEntidadesFinancierasResponse }
     * 
     */
    public LbtrEntidadesFinancierasResponse createLbtrEntidadesFinancierasResponse() {
        return new LbtrEntidadesFinancierasResponse();
    }

    /**
     * Create an instance of {@link LbtrFacilidadesDisponibles }
     * 
     */
    public LbtrFacilidadesDisponibles createLbtrFacilidadesDisponibles() {
        return new LbtrFacilidadesDisponibles();
    }

    /**
     * Create an instance of {@link LbtrFacilidadesDisponiblesResponse }
     * 
     */
    public LbtrFacilidadesDisponiblesResponse createLbtrFacilidadesDisponiblesResponse() {
        return new LbtrFacilidadesDisponiblesResponse();
    }

    /**
     * Create an instance of {@link LbtrMonedas }
     * 
     */
    public LbtrMonedas createLbtrMonedas() {
        return new LbtrMonedas();
    }

    /**
     * Create an instance of {@link LbtrMonedasResponse }
     * 
     */
    public LbtrMonedasResponse createLbtrMonedasResponse() {
        return new LbtrMonedasResponse();
    }

    /**
     * Create an instance of {@link LbtrMovimientosCtaCte }
     * 
     */
    public LbtrMovimientosCtaCte createLbtrMovimientosCtaCte() {
        return new LbtrMovimientosCtaCte();
    }

    /**
     * Create an instance of {@link LbtrMovimientosCtaCteResponse }
     * 
     */
    public LbtrMovimientosCtaCteResponse createLbtrMovimientosCtaCteResponse() {
        return new LbtrMovimientosCtaCteResponse();
    }

    /**
     * Create an instance of {@link LbtrNegCompraVentaME }
     * 
     */
    public LbtrNegCompraVentaME createLbtrNegCompraVentaME() {
        return new LbtrNegCompraVentaME();
    }

    /**
     * Create an instance of {@link LbtrNegCompraVentaMEResponse }
     * 
     */
    public LbtrNegCompraVentaMEResponse createLbtrNegCompraVentaMEResponse() {
        return new LbtrNegCompraVentaMEResponse();
    }

    /**
     * Create an instance of {@link LbtrOperacionesOtorgadas }
     * 
     */
    public LbtrOperacionesOtorgadas createLbtrOperacionesOtorgadas() {
        return new LbtrOperacionesOtorgadas();
    }

    /**
     * Create an instance of {@link LbtrOperacionesOtorgadasResponse }
     * 
     */
    public LbtrOperacionesOtorgadasResponse createLbtrOperacionesOtorgadasResponse() {
        return new LbtrOperacionesOtorgadasResponse();
    }

    /**
     * Create an instance of {@link LbtrOperacionesRecibidas }
     * 
     */
    public LbtrOperacionesRecibidas createLbtrOperacionesRecibidas() {
        return new LbtrOperacionesRecibidas();
    }

    /**
     * Create an instance of {@link LbtrOperacionesRecibidasResponse }
     * 
     */
    public LbtrOperacionesRecibidasResponse createLbtrOperacionesRecibidasResponse() {
        return new LbtrOperacionesRecibidasResponse();
    }

    /**
     * Create an instance of {@link LbtrSaldosCtaCte }
     * 
     */
    public LbtrSaldosCtaCte createLbtrSaldosCtaCte() {
        return new LbtrSaldosCtaCte();
    }

    /**
     * Create an instance of {@link LbtrSaldosCtaCteResponse }
     * 
     */
    public LbtrSaldosCtaCteResponse createLbtrSaldosCtaCteResponse() {
        return new LbtrSaldosCtaCteResponse();
    }

    /**
     * Create an instance of {@link LbtrTarifario }
     * 
     */
    public LbtrTarifario createLbtrTarifario() {
        return new LbtrTarifario();
    }

    /**
     * Create an instance of {@link LbtrTarifarioResponse }
     * 
     */
    public LbtrTarifarioResponse createLbtrTarifarioResponse() {
        return new LbtrTarifarioResponse();
    }

    /**
     * Create an instance of {@link LbtrTipoCambio }
     * 
     */
    public LbtrTipoCambio createLbtrTipoCambio() {
        return new LbtrTipoCambio();
    }

    /**
     * Create an instance of {@link LbtrTipoCambioResponse }
     * 
     */
    public LbtrTipoCambioResponse createLbtrTipoCambioResponse() {
        return new LbtrTipoCambioResponse();
    }

    /**
     * Create an instance of {@link BeanCompraVentaME }
     * 
     */
    public BeanCompraVentaME createBeanCompraVentaME() {
        return new BeanCompraVentaME();
    }

    /**
     * Create an instance of {@link BaseObject }
     * 
     */
    public BaseObject createBaseObject() {
        return new BaseObject();
    }

    /**
     * Create an instance of {@link BeanMoneda }
     * 
     */
    public BeanMoneda createBeanMoneda() {
        return new BeanMoneda();
    }

    /**
     * Create an instance of {@link BeanSaldoCtaCte }
     * 
     */
    public BeanSaldoCtaCte createBeanSaldoCtaCte() {
        return new BeanSaldoCtaCte();
    }

    /**
     * Create an instance of {@link BeanAgenteBolsa }
     * 
     */
    public BeanAgenteBolsa createBeanAgenteBolsa() {
        return new BeanAgenteBolsa();
    }

    /**
     * Create an instance of {@link BeanOperacion }
     * 
     */
    public BeanOperacion createBeanOperacion() {
        return new BeanOperacion();
    }

    /**
     * Create an instance of {@link BeanCobroTarifa }
     * 
     */
    public BeanCobroTarifa createBeanCobroTarifa() {
        return new BeanCobroTarifa();
    }

    /**
     * Create an instance of {@link BeanDetalleCobroTarifa }
     * 
     */
    public BeanDetalleCobroTarifa createBeanDetalleCobroTarifa() {
        return new BeanDetalleCobroTarifa();
    }

    /**
     * Create an instance of {@link BeanFacilidadInstitucion }
     * 
     */
    public BeanFacilidadInstitucion createBeanFacilidadInstitucion() {
        return new BeanFacilidadInstitucion();
    }

    /**
     * Create an instance of {@link BeanMovimientoCtaCte }
     * 
     */
    public BeanMovimientoCtaCte createBeanMovimientoCtaCte() {
        return new BeanMovimientoCtaCte();
    }

    /**
     * Create an instance of {@link BeanCuentaCorriente }
     * 
     */
    public BeanCuentaCorriente createBeanCuentaCorriente() {
        return new BeanCuentaCorriente();
    }

    /**
     * Create an instance of {@link BeanTipoCambio }
     * 
     */
    public BeanTipoCambio createBeanTipoCambio() {
        return new BeanTipoCambio();
    }

    /**
     * Create an instance of {@link BeanConceptoLiquidacion }
     * 
     */
    public BeanConceptoLiquidacion createBeanConceptoLiquidacion() {
        return new BeanConceptoLiquidacion();
    }

    /**
     * Create an instance of {@link BeanTarifa }
     * 
     */
    public BeanTarifa createBeanTarifa() {
        return new BeanTarifa();
    }

    /**
     * Create an instance of {@link BeanEntidadFinanciera }
     * 
     */
    public BeanEntidadFinanciera createBeanEntidadFinanciera() {
        return new BeanEntidadFinanciera();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrAgentesBolsa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrAgentesBolsa }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_AgentesBolsa")
    public JAXBElement<LbtrAgentesBolsa> createLbtrAgentesBolsa(LbtrAgentesBolsa value) {
        return new JAXBElement<LbtrAgentesBolsa>(_LbtrAgentesBolsa_QNAME, LbtrAgentesBolsa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrAgentesBolsaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrAgentesBolsaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_AgentesBolsaResponse")
    public JAXBElement<LbtrAgentesBolsaResponse> createLbtrAgentesBolsaResponse(LbtrAgentesBolsaResponse value) {
        return new JAXBElement<LbtrAgentesBolsaResponse>(_LbtrAgentesBolsaResponse_QNAME, LbtrAgentesBolsaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrCobroTarifa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrCobroTarifa }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_CobroTarifa")
    public JAXBElement<LbtrCobroTarifa> createLbtrCobroTarifa(LbtrCobroTarifa value) {
        return new JAXBElement<LbtrCobroTarifa>(_LbtrCobroTarifa_QNAME, LbtrCobroTarifa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrCobroTarifaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrCobroTarifaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_CobroTarifaResponse")
    public JAXBElement<LbtrCobroTarifaResponse> createLbtrCobroTarifaResponse(LbtrCobroTarifaResponse value) {
        return new JAXBElement<LbtrCobroTarifaResponse>(_LbtrCobroTarifaResponse_QNAME, LbtrCobroTarifaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrConceptos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrConceptos }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_Conceptos")
    public JAXBElement<LbtrConceptos> createLbtrConceptos(LbtrConceptos value) {
        return new JAXBElement<LbtrConceptos>(_LbtrConceptos_QNAME, LbtrConceptos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrConceptosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrConceptosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_ConceptosResponse")
    public JAXBElement<LbtrConceptosResponse> createLbtrConceptosResponse(LbtrConceptosResponse value) {
        return new JAXBElement<LbtrConceptosResponse>(_LbtrConceptosResponse_QNAME, LbtrConceptosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrCtasCtesEntidad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrCtasCtesEntidad }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_CtasCtesEntidad")
    public JAXBElement<LbtrCtasCtesEntidad> createLbtrCtasCtesEntidad(LbtrCtasCtesEntidad value) {
        return new JAXBElement<LbtrCtasCtesEntidad>(_LbtrCtasCtesEntidad_QNAME, LbtrCtasCtesEntidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrCtasCtesEntidadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrCtasCtesEntidadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_CtasCtesEntidadResponse")
    public JAXBElement<LbtrCtasCtesEntidadResponse> createLbtrCtasCtesEntidadResponse(LbtrCtasCtesEntidadResponse value) {
        return new JAXBElement<LbtrCtasCtesEntidadResponse>(_LbtrCtasCtesEntidadResponse_QNAME, LbtrCtasCtesEntidadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrEntidadesFinancieras }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrEntidadesFinancieras }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_EntidadesFinancieras")
    public JAXBElement<LbtrEntidadesFinancieras> createLbtrEntidadesFinancieras(LbtrEntidadesFinancieras value) {
        return new JAXBElement<LbtrEntidadesFinancieras>(_LbtrEntidadesFinancieras_QNAME, LbtrEntidadesFinancieras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrEntidadesFinancierasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrEntidadesFinancierasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_EntidadesFinancierasResponse")
    public JAXBElement<LbtrEntidadesFinancierasResponse> createLbtrEntidadesFinancierasResponse(LbtrEntidadesFinancierasResponse value) {
        return new JAXBElement<LbtrEntidadesFinancierasResponse>(_LbtrEntidadesFinancierasResponse_QNAME, LbtrEntidadesFinancierasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrFacilidadesDisponibles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrFacilidadesDisponibles }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_FacilidadesDisponibles")
    public JAXBElement<LbtrFacilidadesDisponibles> createLbtrFacilidadesDisponibles(LbtrFacilidadesDisponibles value) {
        return new JAXBElement<LbtrFacilidadesDisponibles>(_LbtrFacilidadesDisponibles_QNAME, LbtrFacilidadesDisponibles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrFacilidadesDisponiblesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrFacilidadesDisponiblesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_FacilidadesDisponiblesResponse")
    public JAXBElement<LbtrFacilidadesDisponiblesResponse> createLbtrFacilidadesDisponiblesResponse(LbtrFacilidadesDisponiblesResponse value) {
        return new JAXBElement<LbtrFacilidadesDisponiblesResponse>(_LbtrFacilidadesDisponiblesResponse_QNAME, LbtrFacilidadesDisponiblesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrMonedas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrMonedas }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_Monedas")
    public JAXBElement<LbtrMonedas> createLbtrMonedas(LbtrMonedas value) {
        return new JAXBElement<LbtrMonedas>(_LbtrMonedas_QNAME, LbtrMonedas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrMonedasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrMonedasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_MonedasResponse")
    public JAXBElement<LbtrMonedasResponse> createLbtrMonedasResponse(LbtrMonedasResponse value) {
        return new JAXBElement<LbtrMonedasResponse>(_LbtrMonedasResponse_QNAME, LbtrMonedasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrMovimientosCtaCte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrMovimientosCtaCte }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_MovimientosCtaCte")
    public JAXBElement<LbtrMovimientosCtaCte> createLbtrMovimientosCtaCte(LbtrMovimientosCtaCte value) {
        return new JAXBElement<LbtrMovimientosCtaCte>(_LbtrMovimientosCtaCte_QNAME, LbtrMovimientosCtaCte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrMovimientosCtaCteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrMovimientosCtaCteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_MovimientosCtaCteResponse")
    public JAXBElement<LbtrMovimientosCtaCteResponse> createLbtrMovimientosCtaCteResponse(LbtrMovimientosCtaCteResponse value) {
        return new JAXBElement<LbtrMovimientosCtaCteResponse>(_LbtrMovimientosCtaCteResponse_QNAME, LbtrMovimientosCtaCteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrNegCompraVentaME }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrNegCompraVentaME }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_NegCompraVentaME")
    public JAXBElement<LbtrNegCompraVentaME> createLbtrNegCompraVentaME(LbtrNegCompraVentaME value) {
        return new JAXBElement<LbtrNegCompraVentaME>(_LbtrNegCompraVentaME_QNAME, LbtrNegCompraVentaME.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrNegCompraVentaMEResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrNegCompraVentaMEResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_NegCompraVentaMEResponse")
    public JAXBElement<LbtrNegCompraVentaMEResponse> createLbtrNegCompraVentaMEResponse(LbtrNegCompraVentaMEResponse value) {
        return new JAXBElement<LbtrNegCompraVentaMEResponse>(_LbtrNegCompraVentaMEResponse_QNAME, LbtrNegCompraVentaMEResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrOperacionesOtorgadas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrOperacionesOtorgadas }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_OperacionesOtorgadas")
    public JAXBElement<LbtrOperacionesOtorgadas> createLbtrOperacionesOtorgadas(LbtrOperacionesOtorgadas value) {
        return new JAXBElement<LbtrOperacionesOtorgadas>(_LbtrOperacionesOtorgadas_QNAME, LbtrOperacionesOtorgadas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrOperacionesOtorgadasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrOperacionesOtorgadasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_OperacionesOtorgadasResponse")
    public JAXBElement<LbtrOperacionesOtorgadasResponse> createLbtrOperacionesOtorgadasResponse(LbtrOperacionesOtorgadasResponse value) {
        return new JAXBElement<LbtrOperacionesOtorgadasResponse>(_LbtrOperacionesOtorgadasResponse_QNAME, LbtrOperacionesOtorgadasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrOperacionesRecibidas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrOperacionesRecibidas }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_OperacionesRecibidas")
    public JAXBElement<LbtrOperacionesRecibidas> createLbtrOperacionesRecibidas(LbtrOperacionesRecibidas value) {
        return new JAXBElement<LbtrOperacionesRecibidas>(_LbtrOperacionesRecibidas_QNAME, LbtrOperacionesRecibidas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrOperacionesRecibidasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrOperacionesRecibidasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_OperacionesRecibidasResponse")
    public JAXBElement<LbtrOperacionesRecibidasResponse> createLbtrOperacionesRecibidasResponse(LbtrOperacionesRecibidasResponse value) {
        return new JAXBElement<LbtrOperacionesRecibidasResponse>(_LbtrOperacionesRecibidasResponse_QNAME, LbtrOperacionesRecibidasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrSaldosCtaCte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrSaldosCtaCte }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_SaldosCtaCte")
    public JAXBElement<LbtrSaldosCtaCte> createLbtrSaldosCtaCte(LbtrSaldosCtaCte value) {
        return new JAXBElement<LbtrSaldosCtaCte>(_LbtrSaldosCtaCte_QNAME, LbtrSaldosCtaCte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrSaldosCtaCteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrSaldosCtaCteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_SaldosCtaCteResponse")
    public JAXBElement<LbtrSaldosCtaCteResponse> createLbtrSaldosCtaCteResponse(LbtrSaldosCtaCteResponse value) {
        return new JAXBElement<LbtrSaldosCtaCteResponse>(_LbtrSaldosCtaCteResponse_QNAME, LbtrSaldosCtaCteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrTarifario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrTarifario }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_Tarifario")
    public JAXBElement<LbtrTarifario> createLbtrTarifario(LbtrTarifario value) {
        return new JAXBElement<LbtrTarifario>(_LbtrTarifario_QNAME, LbtrTarifario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrTarifarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrTarifarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_TarifarioResponse")
    public JAXBElement<LbtrTarifarioResponse> createLbtrTarifarioResponse(LbtrTarifarioResponse value) {
        return new JAXBElement<LbtrTarifarioResponse>(_LbtrTarifarioResponse_QNAME, LbtrTarifarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrTipoCambio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrTipoCambio }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_TipoCambio")
    public JAXBElement<LbtrTipoCambio> createLbtrTipoCambio(LbtrTipoCambio value) {
        return new JAXBElement<LbtrTipoCambio>(_LbtrTipoCambio_QNAME, LbtrTipoCambio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbtrTipoCambioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LbtrTipoCambioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lbtr.bcrp.gob.pe", name = "lbtr_TipoCambioResponse")
    public JAXBElement<LbtrTipoCambioResponse> createLbtrTipoCambioResponse(LbtrTipoCambioResponse value) {
        return new JAXBElement<LbtrTipoCambioResponse>(_LbtrTipoCambioResponse_QNAME, LbtrTipoCambioResponse.class, null, value);
    }

}
