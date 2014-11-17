package org.fedon.goeuro.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.fedon.goeuro.model.GeoSuggest;
import org.fedon.goeuro.rest.ExternalGeoService;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.proxy.WebResourceFactory;

/**
 * @author Dmytro Fedonin
 *
 */
public class GoeuroTestClient {

    public void callExternalGeoSuggestService(String pattern, String host) {
        String defaulHost = "api.goeuro.com";
        if (host == null)
            host = defaulHost;
        String base = "http://" + host + "/api/v2";
        ClientConfig cc = new ClientConfig();// .register(JacksonFeature.class);
        Client resource = ClientBuilder.newClient(cc);
        ExternalGeoService client = WebResourceFactory.newResource(ExternalGeoService.class, resource.target(base));

        GeoSuggest[] result = client.suggestEng(pattern);
    }
}
