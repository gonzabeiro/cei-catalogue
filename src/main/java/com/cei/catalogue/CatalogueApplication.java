package com.cei.catalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class CatalogueApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalogueApplication.class, args);
    }

    @GetMapping("/debut")
    public String getDebutByPlayer(@RequestParam(value = "userId") String userId) {
        return String.format("Debutaste el día %s!", userId);
    }

    @GetMapping("/played-matches")
    public String getPlayedMatchesByUser(@RequestParam(value = "userId") String userId) {
        return String.format("%s, jugaste %d con el CEI!!", userId);
    }
}
