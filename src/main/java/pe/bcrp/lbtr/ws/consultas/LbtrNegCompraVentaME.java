
package pe.bcrp.lbtr.ws.consultas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para lbtr_NegCompraVentaME complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="lbtr_NegCompraVentaME"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaLiquidacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lbtr_NegCompraVentaME", propOrder = {
    "sid",
    "fechaLiquidacion"
})
public class LbtrNegCompraVentaME {

    protected String sid;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaLiquidacion;

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
     * Obtiene el valor de la propiedad fechaLiquidacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaLiquidacion() {
        return fechaLiquidacion;
    }

    /**
     * Define el valor de la propiedad fechaLiquidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaLiquidacion(XMLGregorianCalendar value) {
        this.fechaLiquidacion = value;
    }

}
