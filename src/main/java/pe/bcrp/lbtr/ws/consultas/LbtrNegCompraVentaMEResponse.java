
package pe.bcrp.lbtr.ws.consultas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para lbtr_NegCompraVentaMEResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="lbtr_NegCompraVentaMEResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="negociacionCVME" type="{http://lbtr.bcrp.gob.pe}beanCompraVentaME" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lbtr_NegCompraVentaMEResponse", propOrder = {
    "negociacionCVME"
})
public class LbtrNegCompraVentaMEResponse {

    @XmlElement(nillable = true)
    protected List<BeanCompraVentaME> negociacionCVME;

    /**
     * Gets the value of the negociacionCVME property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the negociacionCVME property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNegociacionCVME().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeanCompraVentaME }
     * 
     * 
     */
    public List<BeanCompraVentaME> getNegociacionCVME() {
        if (negociacionCVME == null) {
            negociacionCVME = new ArrayList<BeanCompraVentaME>();
        }
        return this.negociacionCVME;
    }

}
