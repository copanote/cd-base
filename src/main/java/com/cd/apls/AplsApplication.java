package com.cd.apls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class AplsApplication {
    public static void main(String[] args) {
        SpringApplication.run(AplsApplication.class, args);
    }
}
