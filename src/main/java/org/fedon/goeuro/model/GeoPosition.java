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
public class GeoPosition {

    BigDecimal latitude;
    BigDecimal longitude;

    @Override
    public String toString() {
        return "GeoPosition [latitude=" + latitude + ", longitude=" + longitude + "]";
    }

    public String toCsv() {
        return "|" + latitude + "|" + longitude;
    }
}
