package com.example.sbms_circuit_breaker;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataRestController {

    private static final String SERVICE_NAME = "dataService";

    @GetMapping("/data")
    @CircuitBreaker(name = SERVICE_NAME, fallbackMethod = "getDataFallback")
    public String getData(@RequestParam String param) {
        if ("fail".equalsIgnoreCase(param)) {
            throw new RuntimeException("Simulated failure");
        }
        return "Main Service Response: " + param;
    }

    public String getDataFallback(String param, Throwable t) {
        return "Fallback Response for: " + param;
    }
}
