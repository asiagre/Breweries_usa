package com.example.breweries_us;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
public class BreweriesUsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BreweriesUsApplication.class, args);
	}

}
