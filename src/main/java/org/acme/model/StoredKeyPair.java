package org.acme.model;


import java.util.Objects;

public class StoredKeyPair {

    private final String id;
    private final String serviceName;
    private final String serialNumber;
    private final Long expiration;
    private final byte[] keyStore;
    private final byte[] trustStore;


    public StoredKeyPair(String id, String serviceName, String serialNumber, Long expiration, byte[] keyStore, byte[] trustStore) {
        this.id = Objects.requireNonNull(id, "ID는 필수입니다.");
        this.serviceName = Objects.requireNonNull(serviceName, "ServiceName은 필수입니다.");
        this.serialNumber = Objects.requireNonNull(serialNumber, "S/N is Null");
        this.keyStore = Objects.requireNonNull(keyStore, "keystore os null");
        this.trustStore = Objects.requireNonNull(trustStore, "truststore is null");
        this.expiration = expiration;
    }

    // 3. Getter 메서드만 제공 (Setter 없음)
    public String getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Long getExpiration() {
        return expiration;
    }

    public byte[] getKeyStore() {
        return keyStore;
    }

    public byte[] getTrustStore() {
        return trustStore;
    }

}