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
    @XmlElement(name = "location_id")
    long locationId;
    boolean inEurope;
    String countryCode;
    boolean coreCountry;
    BigDecimal distance;
}
