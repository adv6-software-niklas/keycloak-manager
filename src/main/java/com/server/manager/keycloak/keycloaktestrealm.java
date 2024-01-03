package com.server.manager.keycloak;

import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;  
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.representations.idm.RealmRepresentation;

public class keycloaktestrealm {
    private String serverUrl = "http://localhost:8080/auth";
    private String realm = "master";
    private String clientId = "admin-cli";
    private String clientSecret = "AHU9Vl5M3m1uxMgmNHnfPeWhFPhtvxM2";
    private String password = "admin";
    private String username = "admin";
    private Keycloak keycloak;

    public keycloaktestrealm() {
        keycloak = KeycloakBuilder.builder() 
            .serverUrl(serverUrl) 
            .realm(realm) 
            .username(username) 
            .password(password) 
            .clientId(clientId)
            .clientSecret(clientSecret) 
            .build();
    }

    public void createRealm() {
        RealmRepresentation rr = new RealmRepresentation();
        rr.setId("test-realm");
        rr.setRealm("test-realm");
        rr.setEnabled(true);
        keycloak.realms().create(rr);
    }

    public void deleteRealm() {
        keycloak.realm("test-realm").remove();
    }
}