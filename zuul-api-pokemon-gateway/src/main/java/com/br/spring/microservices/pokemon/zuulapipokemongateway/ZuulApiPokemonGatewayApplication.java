package com.br.spring.microservices.pokemon.zuulapipokemongateway;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApiPokemonGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiPokemonGatewayApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {

		return Sampler.ALWAYS_SAMPLE;
	}
}

