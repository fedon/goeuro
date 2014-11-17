package org.fedon.goeuro.dao;

import java.util.Arrays;

import org.fedon.goeuro.model.GeoSuggest;

/**
 * Persistence abstraction.
 * 
 * @author Dmytro Fedonin
 * 
 */
public class GeoCsvDao {

    public void write(GeoSuggest[] data) {
        System.out.println("data: " + Arrays.toString(data));
    }
}
