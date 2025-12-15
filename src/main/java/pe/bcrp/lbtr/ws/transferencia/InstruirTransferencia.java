
package pe.bcrp.lbtr.ws.transferencia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para instruirTransferencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="instruirTransferencia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datosTransferencia" type="{http://lbtr.bcrp.gob.pe}datosTransferencia" minOccurs="0"/&gt;
 *         &lt;element name="firma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instruirTransferencia", propOrder = {
    "sid",
    "datosTransferencia",
    "firma"
})
public class InstruirTransferencia {

    protected String sid;
    protected DatosTransferencia datosTransferencia;
    protected String firma;

    /**
     * Obtiene el valor de la propiedad sid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSid() {
        return sid;
    }

    /**
     * Define el valor de la propiedad sid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSid(String value) {
        this.sid = value;
    }

    /**
     * Obtiene el valor de la propiedad datosTransferencia.
     * 
     * @return
     *     possible object is
     *     {@link DatosTransferencia }
     *     
     */
    public DatosTransferencia getDatosTransferencia() {
        return datosTransferencia;
    }

    /**
     * Define el valor de la propiedad datosTransferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosTransferencia }
     *     
     */
    public void setDatosTransferencia(DatosTransferencia value) {
        this.datosTransferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad firma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirma() {
        return firma;
    }

    /**
     * Define el valor de la propiedad firma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirma(String value) {
        this.firma = value;
    }

}
