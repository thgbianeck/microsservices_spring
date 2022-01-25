package com.formacionbdi.springboot.app.item;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Criado utilizando IntelliJ IDEA.
 * Projeto: springboot-servicio-item
 * Usuário: Thiago Bianeck (Bianeck)
 * Data: 25/01/2022
 * Hora: 01:20
 */
@Configuration
public class AppConfig {

    @Bean("clientRest")
    public RestTemplate registrarRestTemplate() {
        return new RestTemplate();
    }
}
