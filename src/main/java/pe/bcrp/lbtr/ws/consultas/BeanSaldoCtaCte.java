
package pe.bcrp.lbtr.ws.consultas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para beanSaldoCtaCte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beanSaldoCtaCte"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lbtr.bcrp.gob.pe}baseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaSaldo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="numCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="saldoActual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="saldoInicial" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalAbonos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalCargos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beanSaldoCtaCte", propOrder = {
    "codEntidad",
    "fechaSaldo",
    "numCuenta",
    "saldoActual",
    "saldoInicial",
    "totalAbonos",
    "totalCargos"
})
public class BeanSaldoCtaCte
    extends BaseObject
{

    protected String codEntidad;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaSaldo;
    protected String numCuenta;
    protected BigDecimal saldoActual;
    protected BigDecimal saldoInicial;
    protected BigDecimal totalAbonos;
    protected BigDecimal totalCargos;

    /**
     * Obtiene el valor de la propiedad codEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEntidad() {
        return codEntidad;
    }

    /**
     * Define el valor de la propiedad codEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEntidad(String value) {
        this.codEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSaldo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaSaldo() {
        return fechaSaldo;
    }

    /**
     * Define el valor de la propiedad fechaSaldo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaSaldo(XMLGregorianCalendar value) {
        this.fechaSaldo = value;
    }

    /**
     * Obtiene el valor de la propiedad numCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * Define el valor de la propiedad numCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCuenta(String value) {
        this.numCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoActual.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoActual() {
        return saldoActual;
    }

    /**
     * Define el valor de la propiedad saldoActual.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoActual(BigDecimal value) {
        this.saldoActual = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoInicial.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoInicial() {
        return saldoInicial;
    }

    /**
     * Define el valor de la propiedad saldoInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoInicial(BigDecimal value) {
        this.saldoInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAbonos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAbonos() {
        return totalAbonos;
    }

    /**
     * Define el valor de la propiedad totalAbonos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAbonos(BigDecimal value) {
        this.totalAbonos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCargos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCargos() {
        return totalCargos;
    }

    /**
     * Define el valor de la propiedad totalCargos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCargos(BigDecimal value) {
        this.totalCargos = value;
    }

}
