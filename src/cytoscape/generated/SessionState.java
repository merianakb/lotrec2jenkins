//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.4-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.01.16 at 04:02:44 PM PST 
//


package cytoscape.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{}plugins" minOccurs="0"/>
 *         &lt;element ref="{}desktop" minOccurs="0"/>
 *         &lt;element ref="{}server" minOccurs="0"/>
 *         &lt;element ref="{}cytopanels"/>
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
    "plugins",
    "desktop",
    "server",
    "cytopanels"
})
@XmlRootElement(name = "sessionState")
public class SessionState {

    protected Plugins plugins;
    protected Desktop desktop;
    protected Server server;
    @XmlElement(required = true)
    protected Cytopanels cytopanels;

    /**
     * Gets the value of the plugins property.
     * 
     * @return
     *     possible object is
     *     {@link Plugins }
     *     
     */
    public Plugins getPlugins() {
        return plugins;
    }

    /**
     * Sets the value of the plugins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Plugins }
     *     
     */
    public void setPlugins(Plugins value) {
        this.plugins = value;
    }

    /**
     * Gets the value of the desktop property.
     * 
     * @return
     *     possible object is
     *     {@link Desktop }
     *     
     */
    public Desktop getDesktop() {
        return desktop;
    }

    /**
     * Sets the value of the desktop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Desktop }
     *     
     */
    public void setDesktop(Desktop value) {
        this.desktop = value;
    }

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link Server }
     *     
     */
    public Server getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link Server }
     *     
     */
    public void setServer(Server value) {
        this.server = value;
    }

    /**
     * Gets the value of the cytopanels property.
     * 
     * @return
     *     possible object is
     *     {@link Cytopanels }
     *     
     */
    public Cytopanels getCytopanels() {
        return cytopanels;
    }

    /**
     * Sets the value of the cytopanels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cytopanels }
     *     
     */
    public void setCytopanels(Cytopanels value) {
        this.cytopanels = value;
    }

}
