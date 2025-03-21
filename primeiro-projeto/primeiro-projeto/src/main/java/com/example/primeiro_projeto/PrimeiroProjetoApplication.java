package com.example.primeiro_projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.primeiro_projeto.controller")
public class PrimeiroProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoApplication.class, args);
	}

}
