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
        String defaulHost = "api.goeuro.com";
        if (host == null)
            host = defaulHost;
        String base = "http://" + host + "/api/v2";
        ClientConfig cc = new ClientConfig().register(JacksonFeature.class);
        Client resource = ClientBuilder.newClient(cc);
        ExternalGeoService client = WebResourceFactory.newResource(ExternalGeoService.class, resource.target(base));

        return client.suggestEng(pattern);
    }
}
