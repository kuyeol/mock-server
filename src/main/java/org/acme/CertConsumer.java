package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.model.StoredKeyPair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("api/key")
public class CertConsumer {

    private static final Logger log = LoggerFactory.getLogger(CertConsumer.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String ListenCert() {
        return "hello";
    }

    @POST
    public void listenKey(StoredKeyPair key) {
        log.info(" received {}", key);
    }

}
