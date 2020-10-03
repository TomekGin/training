package com.sda.spring.training.animal;

import org.slf4j.Logger;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Elephant implements Animal{
    private static final String ELEPHANT_SOUND = "RUTUTU";
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Elephant.class);

    @Override
    public void sound(){
//        System.out.println("Elephant: " + ELEPHANT_SOUND);
        log.info("ELEPHANT: " + ELEPHANT_SOUND);
    }
}
