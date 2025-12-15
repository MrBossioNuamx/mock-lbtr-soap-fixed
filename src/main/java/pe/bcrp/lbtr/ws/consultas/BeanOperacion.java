
package pe.bcrp.lbtr.ws.consultas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para beanOperacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beanOperacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lbtr.bcrp.gob.pe}baseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codBancoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codBancoOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codConcepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoSAB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="confirmaAbono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cuentaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cuentaInterbancariaSAB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cuentaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datosCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoLiquidacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaLiquidacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fechaNegociacionCavali" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="horaLiquidacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instruccionesPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montoOperacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="numRefCavali" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numRefEnlaceOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numRefLBTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numRefOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prioridad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tipoCambio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tipoParticipanteCavali" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beanOperacion", propOrder = {
    "codBancoDestino",
    "codBancoOrigen",
    "codConcepto",
    "codMoneda",
    "codigoSAB",
    "confirmaAbono",
    "cuentaDestino",
    "cuentaInterbancariaSAB",
    "cuentaOrigen",
    "datosCliente",
    "estadoLiquidacion",
    "fechaLiquidacion",
    "fechaNegociacionCavali",
    "horaLiquidacion",
    "instruccionesPago",
    "montoOperacion",
    "numRefCavali",
    "numRefEnlaceOperacion",
    "numRefLBTR",
    "numRefOrigen",
    "prioridad",
    "tipoCambio",
    "tipoParticipanteCavali"
})
public class BeanOperacion
    extends BaseObject
{

    protected String codBancoDestino;
    protected String codBancoOrigen;
    protected String codConcepto;
    protected String codMoneda;
    protected String codigoSAB;
    protected String confirmaAbono;
    protected String cuentaDestino;
    protected String cuentaInterbancariaSAB;
    protected String cuentaOrigen;
    protected String datosCliente;
    protected String estadoLiquidacion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaLiquidacion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNegociacionCavali;
    protected String horaLiquidacion;
    protected String instruccionesPago;
    protected BigDecimal montoOperacion;
    protected String numRefCavali;
    protected String numRefEnlaceOperacion;
    protected String numRefLBTR;
    protected String numRefOrigen;
    protected Integer prioridad;
    protected BigDecimal tipoCambio;
    protected String tipoParticipanteCavali;

    /**
     * Obtiene el valor de la propiedad codBancoDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodBancoDestino() {
        return codBancoDestino;
    }

    /**
     * Define el valor de la propiedad codBancoDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodBancoDestino(String value) {
        this.codBancoDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad codBancoOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodBancoOrigen() {
        return codBancoOrigen;
    }

    /**
     * Define el valor de la propiedad codBancoOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodBancoOrigen(String value) {
        this.codBancoOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad codConcepto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodConcepto() {
        return codConcepto;
    }

    /**
     * Define el valor de la propiedad codConcepto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodConcepto(String value) {
        this.codConcepto = value;
    }

    /**
     * Obtiene el valor de la propiedad codMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMoneda() {
        return codMoneda;
    }

    /**
     * Define el valor de la propiedad codMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMoneda(String value) {
        this.codMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoSAB.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSAB() {
        return codigoSAB;
    }

    /**
     * Define el valor de la propiedad codigoSAB.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSAB(String value) {
        this.codigoSAB = value;
    }

    /**
     * Obtiene el valor de la propiedad confirmaAbono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmaAbono() {
        return confirmaAbono;
    }

    /**
     * Define el valor de la propiedad confirmaAbono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmaAbono(String value) {
        this.confirmaAbono = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaDestino() {
        return cuentaDestino;
    }

    /**
     * Define el valor de la propiedad cuentaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaDestino(String value) {
        this.cuentaDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaInterbancariaSAB.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaInterbancariaSAB() {
        return cuentaInterbancariaSAB;
    }

    /**
     * Define el valor de la propiedad cuentaInterbancariaSAB.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaInterbancariaSAB(String value) {
        this.cuentaInterbancariaSAB = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    /**
     * Define el valor de la propiedad cuentaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaOrigen(String value) {
        this.cuentaOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad datosCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosCliente() {
        return datosCliente;
    }

    /**
     * Define el valor de la propiedad datosCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosCliente(String value) {
        this.datosCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoLiquidacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoLiquidacion() {
        return estadoLiquidacion;
    }

    /**
     * Define el valor de la propiedad estadoLiquidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoLiquidacion(String value) {
        this.estadoLiquidacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaLiquidacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaLiquidacion() {
        return fechaLiquidacion;
    }

    /**
     * Define el valor de la propiedad fechaLiquidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaLiquidacion(XMLGregorianCalendar value) {
        this.fechaLiquidacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNegociacionCavali.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNegociacionCavali() {
        return fechaNegociacionCavali;
    }

    /**
     * Define el valor de la propiedad fechaNegociacionCavali.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNegociacionCavali(XMLGregorianCalendar value) {
        this.fechaNegociacionCavali = value;
    }

    /**
     * Obtiene el valor de la propiedad horaLiquidacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraLiquidacion() {
        return horaLiquidacion;
    }

    /**
     * Define el valor de la propiedad horaLiquidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraLiquidacion(String value) {
        this.horaLiquidacion = value;
    }

    /**
     * Obtiene el valor de la propiedad instruccionesPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstruccionesPago() {
        return instruccionesPago;
    }

    /**
     * Define el valor de la propiedad instruccionesPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstruccionesPago(String value) {
        this.instruccionesPago = value;
    }

    /**
     * Obtiene el valor de la propiedad montoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoOperacion() {
        return montoOperacion;
    }

    /**
     * Define el valor de la propiedad montoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoOperacion(BigDecimal value) {
        this.montoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numRefCavali.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRefCavali() {
        return numRefCavali;
    }

    /**
     * Define el valor de la propiedad numRefCavali.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRefCavali(String value) {
        this.numRefCavali = value;
    }

    /**
     * Obtiene el valor de la propiedad numRefEnlaceOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRefEnlaceOperacion() {
        return numRefEnlaceOperacion;
    }

    /**
     * Define el valor de la propiedad numRefEnlaceOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRefEnlaceOperacion(String value) {
        this.numRefEnlaceOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numRefLBTR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRefLBTR() {
        return numRefLBTR;
    }

    /**
     * Define el valor de la propiedad numRefLBTR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRefLBTR(String value) {
        this.numRefLBTR = value;
    }

    /**
     * Obtiene el valor de la propiedad numRefOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRefOrigen() {
        return numRefOrigen;
    }

    /**
     * Define el valor de la propiedad numRefOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRefOrigen(String value) {
        this.numRefOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad prioridad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrioridad() {
        return prioridad;
    }

    /**
     * Define el valor de la propiedad prioridad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrioridad(Integer value) {
        this.prioridad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Define el valor de la propiedad tipoCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTipoCambio(BigDecimal value) {
        this.tipoCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoParticipanteCavali.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoParticipanteCavali() {
        return tipoParticipanteCavali;
    }

    /**
     * Define el valor de la propiedad tipoParticipanteCavali.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoParticipanteCavali(String value) {
        this.tipoParticipanteCavali = value;
    }

}
