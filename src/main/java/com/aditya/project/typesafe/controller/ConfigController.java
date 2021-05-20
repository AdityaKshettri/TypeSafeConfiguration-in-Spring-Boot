package com.aditya.project.typesafe.controller;

import com.aditya.project.typesafe.config.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    private ConfigProperties configProperties;

    @GetMapping("")
    public void getProperties() {
        System.out.println(configProperties.getName());
        System.out.println(configProperties.getValue());
        System.out.println(configProperties.getNickName());
    }
}
