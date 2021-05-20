package com.aditya.project.typesafe;

import com.aditya.project.typesafe.config.ConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
public class TypeSafeConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(TypeSafeConfigApplication.class, args);
	}

}
