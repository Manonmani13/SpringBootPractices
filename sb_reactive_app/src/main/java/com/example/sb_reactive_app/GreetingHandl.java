package com.example.sb_reactive_app;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class GreetingHandl {

    public Mono<ServerResponse> handleGreet(ServerRequest request){
        
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
        .body(BodyInserters.formValue(new Greeting("Hello")));
    }
    
}
