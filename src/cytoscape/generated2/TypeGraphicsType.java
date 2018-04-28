//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.4-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.01.16 at 04:02:45 PM PST 
//


package cytoscape.generated2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for type-graphics.type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="type-graphics.type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="arc"/>
 *     &lt;enumeration value="bitmap"/>
 *     &lt;enumeration value="image"/>
 *     &lt;enumeration value="line"/>
 *     &lt;enumeration value="oval"/>
 *     &lt;enumeration value="polygon"/>
 *     &lt;enumeration value="rectangle"/>
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="box"/>
 *     &lt;enumeration value="circle"/>
 *     &lt;enumeration value="ver_ellipsis"/>
 *     &lt;enumeration value="hor_ellipsis"/>
 *     &lt;enumeration value="rhombus"/>
 *     &lt;enumeration value="triangle"/>
 *     &lt;enumeration value="pentagon"/>
 *     &lt;enumeration value="hexagon"/>
 *     &lt;enumeration value="octagon"/>
 *     &lt;enumeration value="ellipse"/>
 *     &lt;enumeration value="diamond"/>
 *     &lt;enumeration value="paralellogram"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TypeGraphicsType {

    @XmlEnumValue("arc")
    ARC("arc"),
    @XmlEnumValue("bitmap")
    BITMAP("bitmap"),
    @XmlEnumValue("image")
    IMAGE("image"),
    @XmlEnumValue("line")
    LINE("line"),
    @XmlEnumValue("oval")
    OVAL("oval"),
    @XmlEnumValue("polygon")
    POLYGON("polygon"),
    @XmlEnumValue("rectangle")
    RECTANGLE("rectangle"),
    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("box")
    BOX("box"),
    @XmlEnumValue("circle")
    CIRCLE("circle"),
    @XmlEnumValue("ver_ellipsis")
    VER_ELLIPSIS("ver_ellipsis"),
    @XmlEnumValue("hor_ellipsis")
    HOR_ELLIPSIS("hor_ellipsis"),
    @XmlEnumValue("rhombus")
    RHOMBUS("rhombus"),
    @XmlEnumValue("triangle")
    TRIANGLE("triangle"),
    @XmlEnumValue("pentagon")
    PENTAGON("pentagon"),
    @XmlEnumValue("hexagon")
    HEXAGON("hexagon"),
    @XmlEnumValue("octagon")
    OCTAGON("octagon"),
    @XmlEnumValue("ellipse")
    ELLIPSE("ellipse"),
    @XmlEnumValue("diamond")
    DIAMOND("diamond"),
    @XmlEnumValue("paralellogram")
    PARALELLOGRAM("paralellogram");
    private final String value;

    TypeGraphicsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeGraphicsType fromValue(String v) {
        for (TypeGraphicsType c: TypeGraphicsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
