
package pe.bcrp.lbtr.ws.consultas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para lbtr_ConceptosResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="lbtr_ConceptosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conceptoLiquidacion" type="{http://lbtr.bcrp.gob.pe}beanConceptoLiquidacion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lbtr_ConceptosResponse", propOrder = {
    "conceptoLiquidacion"
})
public class LbtrConceptosResponse {

    @XmlElement(nillable = true)
    protected List<BeanConceptoLiquidacion> conceptoLiquidacion;

    /**
     * Gets the value of the conceptoLiquidacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conceptoLiquidacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptoLiquidacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeanConceptoLiquidacion }
     * 
     * 
     */
    public List<BeanConceptoLiquidacion> getConceptoLiquidacion() {
        if (conceptoLiquidacion == null) {
            conceptoLiquidacion = new ArrayList<BeanConceptoLiquidacion>();
        }
        return this.conceptoLiquidacion;
    }

}
