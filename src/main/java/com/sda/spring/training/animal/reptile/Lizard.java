package com.sda.spring.training.animal.reptile;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Order(1)
public class Lizard implements Reptile {
    private static final String LIZARD_SOUND = "Liiizzzz";
    @Override
    public void sound() {
        log.info("LIZARD: {}", LIZARD_SOUND);
    }
}
