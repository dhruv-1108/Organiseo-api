package com.organiscoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrganiscoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganiscoApiApplication.class, args);
	}
	  @Bean
	    public ModelMapper modelMapper() {
	        return new ModelMapper();
	    }
}
