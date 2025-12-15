
package pe.bcrp.lbtr.ws.consultas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para beanFacilidadInstitucion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beanFacilidadInstitucion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lbtr.bcrp.gob.pe}baseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codFacilidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desFacilidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beanFacilidadInstitucion", propOrder = {
    "codFacilidad",
    "codMoneda",
    "desFacilidad"
})
public class BeanFacilidadInstitucion
    extends BaseObject
{

    protected String codFacilidad;
    protected String codMoneda;
    protected String desFacilidad;

    /**
     * Obtiene el valor de la propiedad codFacilidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodFacilidad() {
        return codFacilidad;
    }

    /**
     * Define el valor de la propiedad codFacilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodFacilidad(String value) {
        this.codFacilidad = value;
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
     * Obtiene el valor de la propiedad desFacilidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesFacilidad() {
        return desFacilidad;
    }

    /**
     * Define el valor de la propiedad desFacilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesFacilidad(String value) {
        this.desFacilidad = value;
    }

}
