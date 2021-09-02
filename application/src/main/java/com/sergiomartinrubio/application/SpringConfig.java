package com.sergiomartinrubio.application;

import com.sergiomartinrubio.api.PlayerController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public PlayerController playerController() {
        return new PlayerController();
    }
}
