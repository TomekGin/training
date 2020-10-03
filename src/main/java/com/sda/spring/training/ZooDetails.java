package com.sda.spring.training;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ConfigurationProperties("com.sda.zoo")
@Getter
@Setter
@ToString
public class ZooDetails {
    private String zooName;
    private String owner;
    private String address;

    private List<String> telephoneNumbers;
    private Map<String, String> openHours;
}
