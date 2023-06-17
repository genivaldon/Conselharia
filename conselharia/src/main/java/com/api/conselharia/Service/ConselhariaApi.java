package com.api.conselharia.Service;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.api.conselharia.Model.Conselho;
import com.api.conselharia.Model.Response;

@Service
public class ConselhariaApi {


public String retornaConselho() {
    WebClient client = WebClient.create();

    try {
        String response = client.get()
                .uri("https://api.adviceslip.com/advice")
                .retrieve()
                .bodyToMono(String.class)
                .block();
        return response;
    } catch (WebClientResponseException e) {
        System.out.println("Erro ao realizar a requisição: Status " + e.getStatusCode() + ", " + e.getStatusText());
        return null;
    }
}
}