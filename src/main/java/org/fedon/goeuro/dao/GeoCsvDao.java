package org.fedon.goeuro.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import org.fedon.goeuro.model.GeoSuggest;

import au.com.bytecode.opencsv.CSVWriter;

/**
 * Persistence abstraction.
 * 
 * @author Dmytro Fedonin
 * 
 */
public class GeoCsvDao {

    public void write(GeoSuggest[] data) {
        if (data == null)
            return;
        // fast read
        System.out.println("data: " + Arrays.toString(data));
        CSVWriter writer;
        try {
            // TODO consider configuration
            writer = new CSVWriter(new FileWriter("goeuro-test.csv"), ',');
            for (int i = 0; i < data.length; i++) {
                String[] entries = data[i].toCsv().split("\\|");
                writer.writeNext(entries);
            }
            writer.close();
        } catch (IOException e) {
            // TODO consider logger
            System.out.println("CSV persistence failed: " + e);
        }
    }
}
