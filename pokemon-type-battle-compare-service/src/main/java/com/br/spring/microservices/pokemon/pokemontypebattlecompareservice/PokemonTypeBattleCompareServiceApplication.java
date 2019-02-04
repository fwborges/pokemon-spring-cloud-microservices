package com.br.spring.microservices.pokemon.pokemontypebattlecompareservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.br.spring.microservices.pokemon.pokemontypebattlecompareservice")
public class PokemonTypeBattleCompareServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonTypeBattleCompareServiceApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {

		return Sampler.ALWAYS_SAMPLE;
	}

}

