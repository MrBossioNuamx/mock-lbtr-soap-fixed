
package pe.bcrp.lbtr.ws.consultas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para beanCompraVentaME complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beanCompraVentaME"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lbtr.bcrp.gob.pe}baseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codBancoDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codBancoOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codConcepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cuentaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cuentaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaLiquidacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="instruccionesPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mercadoNegociado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montoME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="montoMN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="numRefCompraVentaBCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numRefOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoCambio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beanCompraVentaME", propOrder = {
    "codBancoDestino",
    "codBancoOrigen",
    "codConcepto",
    "cuentaDestino",
    "cuentaOrigen",
    "fechaLiquidacion",
    "instruccionesPago",
    "mercadoNegociado",
    "montoME",
    "montoMN",
    "numRefCompraVentaBCR",
    "numRefOrigen",
    "tipoCambio"
})
public class BeanCompraVentaME
    extends BaseObject
{

    protected String codBancoDestino;
    protected String codBancoOrigen;
    protected String codConcepto;
    protected String cuentaDestino;
    protected String cuentaOrigen;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaLiquidacion;
    protected String instruccionesPago;
    protected String mercadoNegociado;
    protected BigDecimal montoME;
    protected BigDecimal montoMN;
    protected String numRefCompraVentaBCR;
    protected String numRefOrigen;
    protected BigDecimal tipoCambio;

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
     * Obtiene el valor de la propiedad mercadoNegociado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMercadoNegociado() {
        return mercadoNegociado;
    }

    /**
     * Define el valor de la propiedad mercadoNegociado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMercadoNegociado(String value) {
        this.mercadoNegociado = value;
    }

    /**
     * Obtiene el valor de la propiedad montoME.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoME() {
        return montoME;
    }

    /**
     * Define el valor de la propiedad montoME.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoME(BigDecimal value) {
        this.montoME = value;
    }

    /**
     * Obtiene el valor de la propiedad montoMN.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoMN() {
        return montoMN;
    }

    /**
     * Define el valor de la propiedad montoMN.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoMN(BigDecimal value) {
        this.montoMN = value;
    }

    /**
     * Obtiene el valor de la propiedad numRefCompraVentaBCR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRefCompraVentaBCR() {
        return numRefCompraVentaBCR;
    }

    /**
     * Define el valor de la propiedad numRefCompraVentaBCR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRefCompraVentaBCR(String value) {
        this.numRefCompraVentaBCR = value;
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

}
