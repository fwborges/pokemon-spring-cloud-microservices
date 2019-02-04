package com.br.spring.microservices.pokemon.pokemontypeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PokeTypeRepository extends JpaRepository<PokeType, Long> {

    Optional<PokeType> findByType(String type);
}
