package com.sda.spring.training.animal.reptile;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Order(2)
public class Snake implements Reptile {
    private static final String SNAKE_SOUND = "Sssssss";
    @Override
    public void sound() {
        log.info("SNAKE: {}", SNAKE_SOUND);
    }
}
