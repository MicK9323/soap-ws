//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.08.30 a las 09:36:16 PM COT 
//


package com.app.soapws.ws.schemas.providers;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="providers" type="{http://soapws.app.com/ws/schemas/providers}provider" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="new_provider_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "providers",
    "newProviderStatus"
})
@XmlRootElement(name = "getProviderResponse")
public class GetProviderResponse {

    protected List<Provider> providers;
    @XmlElement(name = "new_provider_status")
    protected String newProviderStatus;

    /**
     * Gets the value of the providers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Provider }
     * 
     * 
     */
    public List<Provider> getProviders() {
        if (providers == null) {
            providers = new ArrayList<Provider>();
        }
        return this.providers;
    }

    /**
     * Obtiene el valor de la propiedad newProviderStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewProviderStatus() {
        return newProviderStatus;
    }

    /**
     * Define el valor de la propiedad newProviderStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewProviderStatus(String value) {
        this.newProviderStatus = value;
    }

}
