package com.example.sb_security_customize_app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configurable
@EnableWebSecurity  
public class SecurityConfigurer {

    @Bean
    public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception{
        http.authorizeRequests((request)->request.antMatcher("/","/login","/contact","/swagger-ui.html").permitAll().anyRequest().authenticated()).formLogin();
        return http.build();

    }
    
}
