package com.example.suduko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.suduko.controller.UserController;

@SpringBootApplication
public class SudukoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SudukoApplication.class, args);
	}

}
