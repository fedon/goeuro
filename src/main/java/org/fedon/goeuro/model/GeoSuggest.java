package org.fedon.goeuro.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Dmytro Fedonin
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class GeoSuggest {

    @XmlElement(name = "_id")
    long id;
    long key;
    String name;
    String fullName;
    @XmlElement(name = "iata_airport_code")
    int airportCodeIATA;
    String type;
    String country;
    @XmlElement(name = "geo_position")
    GeoPosition position;
    long locationId;
    boolean inEurope;
    String countryCode;
    boolean coreCountry;
    BigDecimal distance;

    @Override
    public String toString() {
        return "GeoSuggest [id=" + id + ", key=" + key + ", name=" + name + ", fullName=" + fullName + ", airportCodeIATA=" + airportCodeIATA
                + ", type=" + type + ", country=" + country + ", position=" + position + ", locationId=" + locationId + ", inEurope=" + inEurope
                + ", countryCode=" + countryCode + ", coreCountry=" + coreCountry + ", distance=" + distance + "]";
    }

    public String toCsv() {
        return Long.toString(id) + "|" + name + "|" + type + position.toCsv();
    }
}
