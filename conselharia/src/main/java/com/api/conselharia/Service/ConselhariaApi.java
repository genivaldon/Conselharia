package com.api.conselharia.Service;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ConselhariaApi {

public String RetornaConselho(){
    WebClient client = WebClient.create();
    String response = client.get()
                .uri("https://api.adviceslip.com/advice")
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return response;
}
}