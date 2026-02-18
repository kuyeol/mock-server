package org.acme;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.model.StoredKeyPair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

@Path("api/key")
public class CertConsumer {

    private static final Logger log = LoggerFactory.getLogger(CertConsumer.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String ListenCert() {
        return "hello";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void listenKey( StoredKeyPair key) {
        log.info("\n##Received Cert\nID :{} \nName: {} \nSN: {}\n", key.getId(),key.getServiceName(),key.getSerialNumber());
    }

}
