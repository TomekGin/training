package com.sda.spring.training.animal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Dog implements Animal{
    private static final String DOG_SOUND = "woof woof";

    @Override
    public void sound() {
        log.info("DOG: {}", DOG_SOUND);
    }
}
