
package pe.bcrp.lbtr.ws.consultas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para beanMovimientoCtaCte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beanMovimientoCtaCte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lbtr.bcrp.gob.pe}baseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codCargoAbono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codConcepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codEntidadCP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaLiquidacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="instruccionesPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montoOperacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="numCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numRefLBTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "beanMovimientoCtaCte", propOrder = {
    "codCargoAbono",
    "codConcepto",
    "codEntidad",
    "codEntidadCP",
    "codMoneda",
    "fechaLiquidacion",
    "instruccionesPago",
    "montoOperacion",
    "numCuenta",
    "numRefLBTR",
    "tipoCambio"
})
public class BeanMovimientoCtaCte
    extends BaseObject
{

    protected String codCargoAbono;
    protected String codConcepto;
    protected String codEntidad;
    protected String codEntidadCP;
    protected String codMoneda;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaLiquidacion;
    protected String instruccionesPago;
    protected BigDecimal montoOperacion;
    protected String numCuenta;
    protected String numRefLBTR;
    protected BigDecimal tipoCambio;

    /**
     * Obtiene el valor de la propiedad codCargoAbono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCargoAbono() {
        return codCargoAbono;
    }

    /**
     * Define el valor de la propiedad codCargoAbono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCargoAbono(String value) {
        this.codCargoAbono = value;
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
     * Obtiene el valor de la propiedad codEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEntidad() {
        return codEntidad;
    }

    /**
     * Define el valor de la propiedad codEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEntidad(String value) {
        this.codEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codEntidadCP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEntidadCP() {
        return codEntidadCP;
    }

    /**
     * Define el valor de la propiedad codEntidadCP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEntidadCP(String value) {
        this.codEntidadCP = value;
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
     * Obtiene el valor de la propiedad numCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * Define el valor de la propiedad numCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCuenta(String value) {
        this.numCuenta = value;
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
