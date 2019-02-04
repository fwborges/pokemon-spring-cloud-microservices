package com.br.spring.microservices.pokemon.eurekapokemonnamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaPokemonNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaPokemonNamingServerApplication.class, args);
	}

}

