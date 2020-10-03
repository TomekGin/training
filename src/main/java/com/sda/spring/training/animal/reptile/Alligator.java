package com.sda.spring.training.animal.reptile;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Order(3)
public class Alligator implements Reptile {
    @Override
    public void sound() {
        log.info("ALLIGATOR: Snap snap");
    }
}
