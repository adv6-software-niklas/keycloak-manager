package com.server.manager.keycloak;

import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;  
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.representations.idm.RealmRepresentation;

public class keycloaktestrealm {
    private String serverUrl = "http://localhost:8080/";
    private String realm = "master";
    private String clientId = "admin_client";
    private String clientSecret = "wdB1fuudaZumYw6Qo43SZcMA2olOuqWM";
    private String password = "admin";
    private String username = "admin";
    private Keycloak keycloak;

    public keycloaktestrealm() {
        keycloak = KeycloakBuilder.builder() //
            .serverUrl(serverUrl) //
            .realm(realm) //
            .grantType(OAuth2Constants.CLIENT_CREDENTIALS) //
            .clientId(clientId) //
            .clientSecret(clientSecret) //
            .username(username) //
            .password(password) //
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