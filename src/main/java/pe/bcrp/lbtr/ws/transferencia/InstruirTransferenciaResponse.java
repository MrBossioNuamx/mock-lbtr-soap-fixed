
package pe.bcrp.lbtr.ws.transferencia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para instruirTransferenciaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="instruirTransferenciaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="respuestaLBTR" type="{http://lbtr.bcrp.gob.pe}respuestaLBTR" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instruirTransferenciaResponse", propOrder = {
    "respuestaLBTR"
})
public class InstruirTransferenciaResponse {

    protected RespuestaLBTR respuestaLBTR;

    /**
     * Obtiene el valor de la propiedad respuestaLBTR.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaLBTR }
     *     
     */
    public RespuestaLBTR getRespuestaLBTR() {
        return respuestaLBTR;
    }

    /**
     * Define el valor de la propiedad respuestaLBTR.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaLBTR }
     *     
     */
    public void setRespuestaLBTR(RespuestaLBTR value) {
        this.respuestaLBTR = value;
    }

}
