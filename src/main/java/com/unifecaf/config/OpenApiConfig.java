package com.unifecaf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API veicle location")
                        .version("1.0.0")
                        .description("API - Trabalho de Orientação a objetos UNIFECAF")
                        .contact(new Contact()
                                .name("Fernando da Silva")
                                .email("fernando.nandotania@hotmail.com")));
    }
}