package com.example.controller;

import java.net.http.HttpClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.session.SessionCreationEvent;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.NoOpAccessDeniedHandler;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;

@Configuration
@EnableWebSecurity
public class SEcurityCongiguration {


    @Autowired
    UserDetailsService userDetailsService;

    // @Bean
    // public SecurityFilterChain securityFilterChain(HttpSecurity httpClient) throws Exception{
    //     httpClient.csrf(custo-> custo.disable());
    //     httpClient.authorizeRequests(request->request.anyRequest().authenticated());
    //     httpClient.formLogin(Customizer.withDefaults());
    //     httpClient.httpBasic(Customizer.withDefaults());
    //     httpClient.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
    //     return httpClient.build();

    // }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpClient) throws Exception{
        return httpClient.csrf(custo-> custo.disable())
        .authorizeRequests(request->request
        .requestMatchers("/admin//**").hasRole("ADMIN")
        .requestMatchers("/user/**").hasRole("ADMIN","USER")
        .anyRequest().authenticated())
        .httpBasic(Customizer.withDefaults())
        .sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
        .build();
    

    }

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user1=User.withDefaultPasswordEncoder().username("mano").password("1234").roles("USER").build();
        UserDetails user2=User.withDefaultPasswordEncoder().username("pandu").password("1234").roles("USER").build();

        return new InMemoryUserDetailsManager(user1,user2);
    }
    

    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationConfigurer provider=new DaoAuthenticationProvider();
        // provider.setPasswordEncoder(NoOpPasswordEncoder);
        //if you want to give password as given without hasing it take password
        provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
        provider.setUserDetailsService(userDetailsService);
        return provider;
    }
}
