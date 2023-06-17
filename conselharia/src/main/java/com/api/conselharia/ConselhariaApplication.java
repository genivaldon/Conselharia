package com.api.conselharia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.api.conselharia.Service.ConselhariaApi;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class ConselhariaApplication {

    @Autowired
    private ConselhariaApi conselhariaApi;

    public static void main(String[] args) {
        SpringApplication.run(ConselhariaApplication.class, args);
    }

    @PostConstruct
    public void printConselho() {
        System.out.println("Conselho: " + conselhariaApi.retornaConselho());
    }
}