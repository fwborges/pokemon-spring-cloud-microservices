package com.br.spring.microservices.pokemon.pokemontypeservice;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PokeTypeController {

    @Autowired
    private PokeTypeRepository typeRepository;

    @Autowired
    private Environment environment;

    @GetMapping("type/{type}")
    @HystrixCommand(fallbackMethod = "fallbackGetInfoPokeType")
    public PokeType getInfoPokeType(@PathVariable String type) {

        Optional<PokeType> pokeTypeOpt = typeRepository.findByType(type.toLowerCase());

        PokeType pokeType = pokeTypeOpt.orElseThrow(RuntimeException::new);
        pokeType.setPort(Integer.parseInt(environment.getProperty("local.server.port")));

        return pokeType;
    }

    public PokeType fallbackGetInfoPokeType(String type) {

        return new PokeType(0l, type, "no one", "no one", 0);
    }
}
