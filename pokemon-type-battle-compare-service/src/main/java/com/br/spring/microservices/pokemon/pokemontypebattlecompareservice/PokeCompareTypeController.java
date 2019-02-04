package com.br.spring.microservices.pokemon.pokemontypebattlecompareservice;


import com.br.spring.microservices.pokemon.pokemontypebattlecompareservice.dto.PokeType;
import com.br.spring.microservices.pokemon.pokemontypebattlecompareservice.dto.ResponseCompare;
import com.br.spring.microservices.pokemon.pokemontypebattlecompareservice.feignclient.PokeTypeServiceProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokeCompareTypeController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PokeTypeServiceProxy pokeTypeServiceProxy;

    @GetMapping("/battle/{typeOne}/versus/{typeTwo}")
    public ResponseCompare getCompareTypeBattle(@PathVariable String typeOne, @PathVariable String typeTwo) {

        PokeType typeOneInfo = pokeTypeServiceProxy.getInfoPokeType(typeOne);
        logger.info("[PORT POKE TYPE SERVICE][1] ---- > {}", typeOneInfo.getPort());

        PokeType typeTwoInfo = pokeTypeServiceProxy.getInfoPokeType(typeTwo);
        logger.info("[PORT POKE TYPE SERVICE][2] ---- > {}", typeTwoInfo.getPort());

        String winner = "No one";
        String winnerWeakness = "No one";

        if(typeOneInfo.getStrength().equals(typeTwo)) {
            winner = typeOne;
            winnerWeakness = typeOneInfo.getWeakness();
        } else if(typeTwoInfo.getStrength().equals(typeOne)) {
            winner = typeTwo;
            winnerWeakness = typeTwoInfo.getWeakness();
        }

        return new ResponseCompare(typeOne, typeTwo, winner, winnerWeakness);
    }
}
