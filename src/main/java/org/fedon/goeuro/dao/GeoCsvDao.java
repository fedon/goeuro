package org.fedon.goeuro.dao;

import org.fedon.goeuro.model.GeoSuggest;

/**
 * Persistence abstraction.
 * 
 * @author Dmytro Fedonin
 * 
 */
public class GeoCsvDao {

    public void write(GeoSuggest[] data) {
        System.out.println("data: " + data);
    }
}
