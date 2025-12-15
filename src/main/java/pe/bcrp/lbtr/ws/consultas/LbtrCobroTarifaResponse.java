
package pe.bcrp.lbtr.ws.consultas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para lbtr_CobroTarifaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="lbtr_CobroTarifaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beanCobroTarifa" type="{http://lbtr.bcrp.gob.pe}beanCobroTarifa" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lbtr_CobroTarifaResponse", propOrder = {
    "beanCobroTarifa"
})
public class LbtrCobroTarifaResponse {

    protected BeanCobroTarifa beanCobroTarifa;

    /**
     * Obtiene el valor de la propiedad beanCobroTarifa.
     * 
     * @return
     *     possible object is
     *     {@link BeanCobroTarifa }
     *     
     */
    public BeanCobroTarifa getBeanCobroTarifa() {
        return beanCobroTarifa;
    }

    /**
     * Define el valor de la propiedad beanCobroTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link BeanCobroTarifa }
     *     
     */
    public void setBeanCobroTarifa(BeanCobroTarifa value) {
        this.beanCobroTarifa = value;
    }

}
