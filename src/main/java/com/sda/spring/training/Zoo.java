package com.sda.spring.training;

import com.sda.spring.training.animal.Animal;
import com.sda.spring.training.animal.reptile.Reptile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.util.List;

@Component
@Slf4j
public class Zoo implements CommandLineRunner {
    private final Animal elephant;
    private final Animal dog;
    private final Animal penguin;
    private final List<Reptile> reptiles;
    private final BufferedReader bufferedReader;
    private final String zooName;
    private final ZooDetails zooDetails;

    @Autowired
    public Zoo(Animal animal,
               @Qualifier("dog") Animal animal2,
               @Qualifier("penguin") Animal animal3,
               List<Reptile> reptiles,
               BufferedReader bufferedReader,
//               @Value("${com.sda.zoo.zoo-name}")
               @Value("${com.sda.zoo.zoo-name}")
               String zooName,
               ZooDetails zooDetails) {

        this.elephant = animal;
        this.dog = animal2;
        this.penguin = animal3;
        this.reptiles = reptiles;
        this.bufferedReader = bufferedReader;
        this.zooName = zooName;
        this.zooDetails = zooDetails;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("HELLO FROM ZOO - " + zooName);
        log.info(bufferedReader.readLine());

        elephant.sound();
        dog.sound();
        penguin.sound();

        reptiles.forEach(Reptile::sound);
    }

}