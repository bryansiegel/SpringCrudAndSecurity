package com.bryansiegel.springcrudandsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing

public class SpringCrudAndSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCrudAndSecurityApplication.class, args);
    }

}
