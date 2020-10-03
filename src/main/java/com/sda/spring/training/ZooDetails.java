package com.sda.spring.training;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("com.sda.zoo")
@Getter
@Setter
public class ZooDetails {
    private String zooName;
    private String Owner;
    private String Address;
}
