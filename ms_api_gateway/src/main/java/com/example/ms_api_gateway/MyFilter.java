package com.example.ms_api_gateway;

import java.net.http.HttpHeaders;
import java.util.List;
import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;
@Component
public class MyFilter implements GlobalFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request=(ServerHttpRequest) exchange.getRequest();
        org.springframework.http.HttpHeaders headers=request.getHeaders();
        Set<String> keySet=headers.keySet();
        for(String key:keySet){
            List<String> values=headers.get(key);
            System.out.println(key +" : "+values);

        }
        return chain.filter(exchange);
    }
    
}
