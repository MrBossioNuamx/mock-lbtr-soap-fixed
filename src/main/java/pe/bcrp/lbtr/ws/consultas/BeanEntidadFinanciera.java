
package pe.bcrp.lbtr.ws.consultas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para beanEntidadFinanciera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beanEntidadFinanciera"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lbtr.bcrp.gob.pe}baseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomCortoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomLargoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beanEntidadFinanciera", propOrder = {
    "codEntidad",
    "nomCortoEntidad",
    "nomLargoEntidad"
})
public class BeanEntidadFinanciera
    extends BaseObject
{

    protected String codEntidad;
    protected String nomCortoEntidad;
    protected String nomLargoEntidad;

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
     * Obtiene el valor de la propiedad nomCortoEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCortoEntidad() {
        return nomCortoEntidad;
    }

    /**
     * Define el valor de la propiedad nomCortoEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCortoEntidad(String value) {
        this.nomCortoEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad nomLargoEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomLargoEntidad() {
        return nomLargoEntidad;
    }

    /**
     * Define el valor de la propiedad nomLargoEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomLargoEntidad(String value) {
        this.nomLargoEntidad = value;
    }

}
