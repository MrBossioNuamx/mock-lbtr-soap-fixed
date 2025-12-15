
package pe.bcrp.lbtr.ws.consultas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para beanConceptoLiquidacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beanConceptoLiquidacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lbtr.bcrp.gob.pe}baseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codConcepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desConcepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montoMinimo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="servicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beanConceptoLiquidacion", propOrder = {
    "codConcepto",
    "codMoneda",
    "desConcepto",
    "estado",
    "montoMinimo",
    "origen",
    "servicio"
})
public class BeanConceptoLiquidacion
    extends BaseObject
{

    protected String codConcepto;
    protected String codMoneda;
    protected String desConcepto;
    protected String estado;
    protected BigDecimal montoMinimo;
    protected String origen;
    protected String servicio;

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
     * Obtiene el valor de la propiedad desConcepto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesConcepto() {
        return desConcepto;
    }

    /**
     * Define el valor de la propiedad desConcepto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesConcepto(String value) {
        this.desConcepto = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad montoMinimo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoMinimo() {
        return montoMinimo;
    }

    /**
     * Define el valor de la propiedad montoMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoMinimo(BigDecimal value) {
        this.montoMinimo = value;
    }

    /**
     * Obtiene el valor de la propiedad origen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Define el valor de la propiedad origen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Obtiene el valor de la propiedad servicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicio() {
        return servicio;
    }

    /**
     * Define el valor de la propiedad servicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicio(String value) {
        this.servicio = value;
    }

}
