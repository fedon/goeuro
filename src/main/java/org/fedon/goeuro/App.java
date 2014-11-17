package org.fedon.goeuro;

import org.fedon.goeuro.client.GoeuroTestClient;
import org.fedon.goeuro.dao.GeoCsvDao;

/**
 * Main application class.
 * 
 * @author Dmytro Fedonin
 */
public class App 
{
    public static void main( String[] args )
 {
        String pattern = null;
        String host = null;
        if (args.length == 0) {
            System.out.println("Usage: pattern [host]\nwhere pattern -- location name to search.");
            return;
        }
        pattern = args[0];
        if (args.length > 1)
            host = args[1];
        // TODO consider Guice
        new GeoCsvDao().write(new GoeuroTestClient().callExternalGeoSuggestService(pattern, host));
    }
}
