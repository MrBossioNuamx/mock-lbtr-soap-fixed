
package pe.bcrp.lbtr.ws.transferencia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para datosCavali complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosCavali"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lbtr.bcrp.gob.pe}baseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoSAB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cuentaInterbancariaSAB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaNegociacionCavali" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="numRefCavali" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoParticipanteCavali" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosCavali", propOrder = {
    "codigoSAB",
    "cuentaInterbancariaSAB",
    "fechaNegociacionCavali",
    "numRefCavali",
    "tipoParticipanteCavali"
})
public class DatosCavali
    extends BaseObject
{

    protected String codigoSAB;
    protected String cuentaInterbancariaSAB;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNegociacionCavali;
    protected String numRefCavali;
    protected String tipoParticipanteCavali;

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
     * Obtiene el valor de la propiedad cuentaInterbancariaSAB.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaInterbancariaSAB() {
        return cuentaInterbancariaSAB;
    }

    /**
     * Define el valor de la propiedad cuentaInterbancariaSAB.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaInterbancariaSAB(String value) {
        this.cuentaInterbancariaSAB = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNegociacionCavali.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNegociacionCavali() {
        return fechaNegociacionCavali;
    }

    /**
     * Define el valor de la propiedad fechaNegociacionCavali.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNegociacionCavali(XMLGregorianCalendar value) {
        this.fechaNegociacionCavali = value;
    }

    /**
     * Obtiene el valor de la propiedad numRefCavali.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRefCavali() {
        return numRefCavali;
    }

    /**
     * Define el valor de la propiedad numRefCavali.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRefCavali(String value) {
        this.numRefCavali = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoParticipanteCavali.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoParticipanteCavali() {
        return tipoParticipanteCavali;
    }

    /**
     * Define el valor de la propiedad tipoParticipanteCavali.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoParticipanteCavali(String value) {
        this.tipoParticipanteCavali = value;
    }

}
