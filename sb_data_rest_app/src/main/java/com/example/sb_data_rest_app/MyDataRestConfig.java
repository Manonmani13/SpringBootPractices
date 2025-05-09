package com.example.sb_data_rest_app;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

public class MyDataRestConfig  implements RepositoryRestConfigurer{

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
        HttpMethod[] unHttpMethods={HttpMethod.PUT, HttpMethod.DELETE};
        config.getExposureConfiguration()
            .forDomainType(Book.class)
            .withCollectionExposure((metadata,http)->http.disable(unHttpMethods))
            .withAssociationExposure((metadata,http)->http.disable(unHttpMethods));
            

    }
    
}
