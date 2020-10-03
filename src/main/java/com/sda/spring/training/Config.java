package com.sda.spring.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Configuration
public class Config {
    @Bean
    public BufferedReader getBufferedReader() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = Files.newBufferedReader(Path.of
                    ("src/main/resources/welcome.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bufferedReader;
    }
}
