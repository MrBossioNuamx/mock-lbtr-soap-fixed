
package pe.bcrp.lbtr.ws.transferencia;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para datosTransferencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosTransferencia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lbtr.bcrp.gob.pe}baseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codConcepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cuentaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cuentaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datosCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaLiquidacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fechaRefLBTREnlace" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="instruccionesPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montoOperacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="numRefLBTREnlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numRefOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prioridad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosTransferencia", propOrder = {
    "codConcepto",
    "cuentaDestino",
    "cuentaOrigen",
    "datosCliente",
    "fechaLiquidacion",
    "fechaRefLBTREnlace",
    "instruccionesPago",
    "modalidad",
    "montoOperacion",
    "numRefLBTREnlace",
    "numRefOrigen",
    "prioridad"
})
public class DatosTransferencia
    extends BaseObject
{

    protected String codConcepto;
    protected String cuentaDestino;
    protected String cuentaOrigen;
    protected String datosCliente;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaLiquidacion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRefLBTREnlace;
    protected String instruccionesPago;
    protected String modalidad;
    protected BigDecimal montoOperacion;
    protected String numRefLBTREnlace;
    protected String numRefOrigen;
    protected Integer prioridad;

    /**
     * Obtiene el valor de la propiedad codConcepto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodConcepto() {
        return codConcepto;
    }

    /**
     * Define el valor de la propiedad codConcepto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodConcepto(String value) {
        this.codConcepto = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaDestino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaDestino() {
        return cuentaDestino;
    }

    /**
     * Define el valor de la propiedad cuentaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaDestino(String value) {
        this.cuentaDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    /**
     * Define el valor de la propiedad cuentaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaOrigen(String value) {
        this.cuentaOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad datosCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosCliente() {
        return datosCliente;
    }

    /**
     * Define el valor de la propiedad datosCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosCliente(String value) {
        this.datosCliente = value;
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

    /**
     * Obtiene el valor de la propiedad fechaRefLBTREnlace.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRefLBTREnlace() {
        return fechaRefLBTREnlace;
    }

    /**
     * Define el valor de la propiedad fechaRefLBTREnlace.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRefLBTREnlace(XMLGregorianCalendar value) {
        this.fechaRefLBTREnlace = value;
    }

    /**
     * Obtiene el valor de la propiedad instruccionesPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstruccionesPago() {
        return instruccionesPago;
    }

    /**
     * Define el valor de la propiedad instruccionesPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstruccionesPago(String value) {
        this.instruccionesPago = value;
    }

    /**
     * Obtiene el valor de la propiedad modalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModalidad() {
        return modalidad;
    }

    /**
     * Define el valor de la propiedad modalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModalidad(String value) {
        this.modalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad montoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoOperacion() {
        return montoOperacion;
    }

    /**
     * Define el valor de la propiedad montoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoOperacion(BigDecimal value) {
        this.montoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numRefLBTREnlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRefLBTREnlace() {
        return numRefLBTREnlace;
    }

    /**
     * Define el valor de la propiedad numRefLBTREnlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRefLBTREnlace(String value) {
        this.numRefLBTREnlace = value;
    }

    /**
     * Obtiene el valor de la propiedad numRefOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRefOrigen() {
        return numRefOrigen;
    }

    /**
     * Define el valor de la propiedad numRefOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRefOrigen(String value) {
        this.numRefOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad prioridad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrioridad() {
        return prioridad;
    }

    /**
     * Define el valor de la propiedad prioridad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrioridad(Integer value) {
        this.prioridad = value;
    }

}
