
package com.swiftfingers.soap.pkg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Forecast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Forecast">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="WeatherID" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Desciption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Temperatures" type="{http://ws.cdyne.com/WeatherWS/}temp"/>
 *         &lt;element name="ProbabilityOfPrecipiation" type="{http://ws.cdyne.com/WeatherWS/}POP"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Forecast", propOrder = {
    "date",
    "weatherID",
    "desciption",
    "temperatures",
    "probabilityOfPrecipiation"
})
public class Forecast {

    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "WeatherID")
    protected short weatherID;
    @XmlElement(name = "Desciption")
    protected String desciption;
    @XmlElement(name = "Temperatures", required = true)
    protected Temp temperatures;
    @XmlElement(name = "ProbabilityOfPrecipiation", required = true)
    protected POP probabilityOfPrecipiation;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the weatherID property.
     * 
     */
    public short getWeatherID() {
        return weatherID;
    }

    /**
     * Sets the value of the weatherID property.
     * 
     */
    public void setWeatherID(short value) {
        this.weatherID = value;
    }

    /**
     * Gets the value of the desciption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesciption() {
        return desciption;
    }

    /**
     * Sets the value of the desciption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesciption(String value) {
        this.desciption = value;
    }

    /**
     * Gets the value of the temperatures property.
     * 
     * @return
     *     possible object is
     *     {@link Temp }
     *     
     */
    public Temp getTemperatures() {
        return temperatures;
    }

    /**
     * Sets the value of the temperatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temp }
     *     
     */
    public void setTemperatures(Temp value) {
        this.temperatures = value;
    }

    /**
     * Gets the value of the probabilityOfPrecipiation property.
     * 
     * @return
     *     possible object is
     *     {@link POP }
     *     
     */
    public POP getProbabilityOfPrecipiation() {
        return probabilityOfPrecipiation;
    }

    /**
     * Sets the value of the probabilityOfPrecipiation property.
     * 
     * @param value
     *     allowed object is
     *     {@link POP }
     *     
     */
    public void setProbabilityOfPrecipiation(POP value) {
        this.probabilityOfPrecipiation = value;
    }

}
