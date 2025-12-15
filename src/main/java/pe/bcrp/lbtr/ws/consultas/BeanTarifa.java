
package pe.bcrp.lbtr.ws.consultas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para beanTarifa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beanTarifa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lbtr.bcrp.gob.pe}baseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costoFijo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="desTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indAbono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indCargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tarifaAplicada" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beanTarifa", propOrder = {
    "codTarifa",
    "costoFijo",
    "desTarifa",
    "horaFinal",
    "horaInicio",
    "indAbono",
    "indCargo",
    "tarifaAplicada"
})
public class BeanTarifa
    extends BaseObject
{

    protected String codTarifa;
    protected BigDecimal costoFijo;
    protected String desTarifa;
    protected String horaFinal;
    protected String horaInicio;
    protected String indAbono;
    protected String indCargo;
    protected BigDecimal tarifaAplicada;

    /**
     * Obtiene el valor de la propiedad codTarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTarifa() {
        return codTarifa;
    }

    /**
     * Define el valor de la propiedad codTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTarifa(String value) {
        this.codTarifa = value;
    }

    /**
     * Obtiene el valor de la propiedad costoFijo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostoFijo() {
        return costoFijo;
    }

    /**
     * Define el valor de la propiedad costoFijo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostoFijo(BigDecimal value) {
        this.costoFijo = value;
    }

    /**
     * Obtiene el valor de la propiedad desTarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesTarifa() {
        return desTarifa;
    }

    /**
     * Define el valor de la propiedad desTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesTarifa(String value) {
        this.desTarifa = value;
    }

    /**
     * Obtiene el valor de la propiedad horaFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraFinal() {
        return horaFinal;
    }

    /**
     * Define el valor de la propiedad horaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraFinal(String value) {
        this.horaFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad horaInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * Define el valor de la propiedad horaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraInicio(String value) {
        this.horaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad indAbono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndAbono() {
        return indAbono;
    }

    /**
     * Define el valor de la propiedad indAbono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndAbono(String value) {
        this.indAbono = value;
    }

    /**
     * Obtiene el valor de la propiedad indCargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCargo() {
        return indCargo;
    }

    /**
     * Define el valor de la propiedad indCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCargo(String value) {
        this.indCargo = value;
    }

    /**
     * Obtiene el valor de la propiedad tarifaAplicada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTarifaAplicada() {
        return tarifaAplicada;
    }

    /**
     * Define el valor de la propiedad tarifaAplicada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTarifaAplicada(BigDecimal value) {
        this.tarifaAplicada = value;
    }

}
