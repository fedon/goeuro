package org.fedon.goeuro.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.fedon.goeuro.model.GeoSuggest;

/**
 * @author Dmytro Fedonin
 *
 */
public interface ExternalGeoService {

    /**
     * 3rd party rest API emulation. Language may be another argument. For test purpose it is hardcoded.
     * 
     * @param pattern
     * @return
     */
    @GET
    @Path("/suggest/en/{pattern}")
    @Produces(MediaType.APPLICATION_JSON)
    public GeoSuggest suggestEng(@PathParam("pattern") String pattern);
}
