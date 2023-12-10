package com.server.manager.keycloak;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/koentroller")
public class koentroller {
   private keycloaktestrealm test = new keycloaktestrealm();

    @GetMapping("/test/{id}")
    public String getContact(@PathVariable String id) {
        return "lol";
    }
    
    @GetMapping("/test")
    public String createRealm() {
        test.createRealm();
        return "lolz";
    }

    @GetMapping("/delete")
    public String removeRealm() {
        test.deleteRealm();
        return ("dang");
    }

    @PostMapping("/getAll")
    public String addContact(@RequestBody String contact) {
        return "qwrttttyh";
    }
}