package org.fedon.goeuro.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.fedon.goeuro.model.GeoSuggest;
import org.fedon.goeuro.rest.ExternalGeoService;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.proxy.WebResourceFactory;
import org.glassfish.jersey.jackson.JacksonFeature;

/**
 * @author Dmytro Fedonin
 *
 */
public class GoeuroTestClient {

    public GeoSuggest[] callExternalGeoSuggestService(String pattern, String host) {
        // TODO consider configuration
        String defaulHost = "api.goeuro.com";
        String api = "/api/v2";
        if (host == null)
            host = defaulHost;
        String base = "http://" + host + api;
        ClientConfig cc = new ClientConfig().register(JacksonFeature.class);
        Client resource = ClientBuilder.newClient(cc);
        ExternalGeoService client = WebResourceFactory.newResource(ExternalGeoService.class, resource.target(base));

        try {
            return client.suggestEng(pattern);
        } catch (Exception e) {
            // TODO consider logger
            System.out.println("Remote call failed: " + e);
            return null;
        }
    }
}
