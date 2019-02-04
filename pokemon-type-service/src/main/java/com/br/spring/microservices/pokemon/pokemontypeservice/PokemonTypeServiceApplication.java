package com.br.spring.microservices.pokemon.pokemontypeservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class PokemonTypeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonTypeServiceApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {

		return Sampler.ALWAYS_SAMPLE;
	}
}
