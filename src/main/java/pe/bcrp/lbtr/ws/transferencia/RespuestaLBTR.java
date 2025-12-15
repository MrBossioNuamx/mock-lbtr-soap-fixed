
package pe.bcrp.lbtr.ws.transferencia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaLBTR complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaLBTR"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lbtr.bcrp.gob.pe}baseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numRefLBTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaLBTR", propOrder = {
    "estado",
    "numRefLBTR"
})
public class RespuestaLBTR
    extends BaseObject
{

    protected String estado;
    protected String numRefLBTR;

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
     * Obtiene el valor de la propiedad numRefLBTR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRefLBTR() {
        return numRefLBTR;
    }

    /**
     * Define el valor de la propiedad numRefLBTR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRefLBTR(String value) {
        this.numRefLBTR = value;
    }

}
