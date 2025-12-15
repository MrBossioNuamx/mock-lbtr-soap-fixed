
package pe.bcrp.lbtr.ws.consultas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para lbtr_TarifarioResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="lbtr_TarifarioResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tarifario" type="{http://lbtr.bcrp.gob.pe}beanTarifa" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lbtr_TarifarioResponse", propOrder = {
    "tarifario"
})
public class LbtrTarifarioResponse {

    @XmlElement(nillable = true)
    protected List<BeanTarifa> tarifario;

    /**
     * Gets the value of the tarifario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tarifario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarifario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeanTarifa }
     * 
     * 
     */
    public List<BeanTarifa> getTarifario() {
        if (tarifario == null) {
            tarifario = new ArrayList<BeanTarifa>();
        }
        return this.tarifario;
    }

}
