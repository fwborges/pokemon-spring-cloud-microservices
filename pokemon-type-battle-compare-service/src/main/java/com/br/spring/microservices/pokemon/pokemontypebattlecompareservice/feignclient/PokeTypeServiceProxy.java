package com.br.spring.microservices.pokemon.pokemontypebattlecompareservice.feignclient;

import com.br.spring.microservices.pokemon.pokemontypebattlecompareservice.dto.PokeType;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//Without Zuul Api Gateway
//@FeignClient(name="poke-type-service")

//With Zuul Api Gatway
@FeignClient(name="zuul-api-poke-gateway")
@RibbonClient(name="poke-type-service")
public interface PokeTypeServiceProxy {

    //Without Zuul Api Gateway
    //@GetMapping("type/{type}")

    //With Zuul api gateway
    @GetMapping("poke-type-service/type/{type}")
    PokeType getInfoPokeType(@PathVariable("type") String type);
}
