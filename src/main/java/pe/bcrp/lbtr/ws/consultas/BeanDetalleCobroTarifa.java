
package pe.bcrp.lbtr.ws.consultas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para beanDetalleCobroTarifa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beanDetalleCobroTarifa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lbtr.bcrp.gob.pe}baseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codConcepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="montoTarifa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="numOperaciones" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tipoCobro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalConceptoTarifa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beanDetalleCobroTarifa", propOrder = {
    "codConcepto",
    "codTarifa",
    "fecha",
    "montoTarifa",
    "numOperaciones",
    "tipoCobro",
    "totalConceptoTarifa"
})
public class BeanDetalleCobroTarifa
    extends BaseObject
{

    protected String codConcepto;
    protected String codTarifa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected BigDecimal montoTarifa;
    protected Integer numOperaciones;
    protected String tipoCobro;
    protected BigDecimal totalConceptoTarifa;

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
     * Obtiene el valor de la propiedad codTarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTarifa() {
        return codTarifa;
    }

    /**
     * Define el valor de la propiedad codTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTarifa(String value) {
        this.codTarifa = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTarifa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoTarifa() {
        return montoTarifa;
    }

    /**
     * Define el valor de la propiedad montoTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoTarifa(BigDecimal value) {
        this.montoTarifa = value;
    }

    /**
     * Obtiene el valor de la propiedad numOperaciones.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumOperaciones() {
        return numOperaciones;
    }

    /**
     * Define el valor de la propiedad numOperaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumOperaciones(Integer value) {
        this.numOperaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCobro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCobro() {
        return tipoCobro;
    }

    /**
     * Define el valor de la propiedad tipoCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCobro(String value) {
        this.tipoCobro = value;
    }

    /**
     * Obtiene el valor de la propiedad totalConceptoTarifa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalConceptoTarifa() {
        return totalConceptoTarifa;
    }

    /**
     * Define el valor de la propiedad totalConceptoTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalConceptoTarifa(BigDecimal value) {
        this.totalConceptoTarifa = value;
    }

}
