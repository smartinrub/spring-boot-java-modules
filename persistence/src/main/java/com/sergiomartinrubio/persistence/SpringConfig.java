package com.sergiomartinrubio.persistence;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.sergiomartinrubio.persistence.entity")
@EnableJpaRepositories(basePackages = "com.sergiomartinrubio.persistence.repository")
public class SpringConfig {
}
