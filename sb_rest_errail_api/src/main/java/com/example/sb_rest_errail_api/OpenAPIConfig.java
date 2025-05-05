package com.example.sb_rest_errail_api;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
    info = @Info(title = "Erail Ticket API", version = "1.0", description = "Book and retrieve train tickets")
)
@Configuration
public class OpenAPIConfig {
}

