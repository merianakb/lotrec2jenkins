//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.4-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.01.16 at 04:02:44 PM PST 
//


package cytoscape.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}desktopSize" minOccurs="0"/>
 *         &lt;element ref="{}networkFrames" minOccurs="0"/>
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
    "desktopSize",
    "networkFrames"
})
@XmlRootElement(name = "desktop")
public class Desktop {

    protected DesktopSize desktopSize;
    protected NetworkFrames networkFrames;

    /**
     * Gets the value of the desktopSize property.
     * 
     * @return
     *     possible object is
     *     {@link DesktopSize }
     *     
     */
    public DesktopSize getDesktopSize() {
        return desktopSize;
    }

    /**
     * Sets the value of the desktopSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesktopSize }
     *     
     */
    public void setDesktopSize(DesktopSize value) {
        this.desktopSize = value;
    }

    /**
     * Gets the value of the networkFrames property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkFrames }
     *     
     */
    public NetworkFrames getNetworkFrames() {
        return networkFrames;
    }

    /**
     * Sets the value of the networkFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkFrames }
     *     
     */
    public void setNetworkFrames(NetworkFrames value) {
        this.networkFrames = value;
    }

}
