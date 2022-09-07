package com.crocell.vuespringshop;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class VueSpringShopApplication {
	public static void main(String[] args) {
		SpringApplication.run(VueSpringShopApplication.class, args);
	}

}
