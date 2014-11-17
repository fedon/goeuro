package org.fedon.goeuro.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Dmytro Fedonin
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class GeoSuggest {

    long id;
    long key;
    String name;
    String fullName;
    int airportCodeIATA;
    String type;
    String country;
    GeoPosition position;
    long locationId;
    boolean inEurope;
    String countryCode;
    boolean coreCountry;
    BigDecimal distance;
}
