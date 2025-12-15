
package pe.bcrp.lbtr.ws.consultas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para beanAgenteBolsa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beanAgenteBolsa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lbtr.bcrp.gob.pe}baseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoSAB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beanAgenteBolsa", propOrder = {
    "codigoSAB",
    "razonSocial"
})
public class BeanAgenteBolsa
    extends BaseObject
{

    protected String codigoSAB;
    protected String razonSocial;

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
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

}
