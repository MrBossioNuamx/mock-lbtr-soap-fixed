
package pe.bcrp.lbtr.ws.consultas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para beanCuentaCorriente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beanCuentaCorriente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lbtr.bcrp.gob.pe}baseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beanCuentaCorriente", propOrder = {
    "codEntidad",
    "codMoneda",
    "nombreCuenta",
    "numCuenta"
})
public class BeanCuentaCorriente
    extends BaseObject
{

    protected String codEntidad;
    protected String codMoneda;
    protected String nombreCuenta;
    protected String numCuenta;

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
     * Obtiene el valor de la propiedad nombreCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCuenta() {
        return nombreCuenta;
    }

    /**
     * Define el valor de la propiedad nombreCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCuenta(String value) {
        this.nombreCuenta = value;
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

}
