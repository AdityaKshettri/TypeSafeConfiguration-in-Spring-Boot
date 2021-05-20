package com.aditya.project.typesafe.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Data
@Configuration
@ConfigurationProperties(prefix = "property")
public class ConfigProperties {

    private String name;
    private int value;
    private String nickName;
}
