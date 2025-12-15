
package pe.bcrp.lbtr.ws.consultas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para beanCobroTarifa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beanCobroTarifa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lbtr.bcrp.gob.pe}baseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detalle" type="{http://lbtr.bcrp.gob.pe}beanDetalleCobroTarifa" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalFijo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalPeriodo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalVariable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beanCobroTarifa", propOrder = {
    "codEntidad",
    "detalle",
    "periodo",
    "totalFijo",
    "totalPeriodo",
    "totalVariable"
})
public class BeanCobroTarifa
    extends BaseObject
{

    protected String codEntidad;
    @XmlElement(nillable = true)
    protected List<BeanDetalleCobroTarifa> detalle;
    protected String periodo;
    protected BigDecimal totalFijo;
    protected BigDecimal totalPeriodo;
    protected BigDecimal totalVariable;

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
     * Gets the value of the detalle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeanDetalleCobroTarifa }
     * 
     * 
     */
    public List<BeanDetalleCobroTarifa> getDetalle() {
        if (detalle == null) {
            detalle = new ArrayList<BeanDetalleCobroTarifa>();
        }
        return this.detalle;
    }

    /**
     * Obtiene el valor de la propiedad periodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodo(String value) {
        this.periodo = value;
    }

    /**
     * Obtiene el valor de la propiedad totalFijo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalFijo() {
        return totalFijo;
    }

    /**
     * Define el valor de la propiedad totalFijo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalFijo(BigDecimal value) {
        this.totalFijo = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPeriodo() {
        return totalPeriodo;
    }

    /**
     * Define el valor de la propiedad totalPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPeriodo(BigDecimal value) {
        this.totalPeriodo = value;
    }

    /**
     * Obtiene el valor de la propiedad totalVariable.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalVariable() {
        return totalVariable;
    }

    /**
     * Define el valor de la propiedad totalVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalVariable(BigDecimal value) {
        this.totalVariable = value;
    }

}
