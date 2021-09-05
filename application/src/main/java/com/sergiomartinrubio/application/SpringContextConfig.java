package com.sergiomartinrubio.application;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.sergiomartinrubio.api", "com.sergiomartinrubio.model", "com.sergiomartinrubio.persistence"})
public class SpringContextConfig {
}
