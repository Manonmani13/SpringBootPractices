package com.example.sb_reactive_app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.util.RouteMatcher.Route;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class GreetRouter {

    @Bean
    public RouterFunction<ServerResponse> route(GreetingHandl greetingHandl){
        return RouterFunctions.route(GET("/hello").and(accept(MediaType.APPLICATION_JSON)),greeting::hello);
        // return RouterFunctions.route(predicate, greetingHandl::handleGreet)
    }
    
}
