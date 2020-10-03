package com.sda.spring.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//TODO dopisz w prezentacji
@EnableConfigurationProperties(ZooDetails.class)
public class TrainingApplication {

    public static void main(String[] args) {
        // SpringApplication.run(TrainingApplication.class, args);      - run, create local variable
        ConfigurableApplicationContext run =
                SpringApplication.run(TrainingApplication.class, args);
    }

}
