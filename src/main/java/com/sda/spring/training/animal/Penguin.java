package com.sda.spring.training.animal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Penguin implements Animal{
    private static final String PENGUIN_SOUND = "mii mii";

    @Override
    public void sound() {
        log.info("PENGUIN: {}", PENGUIN_SOUND);
    }

}
