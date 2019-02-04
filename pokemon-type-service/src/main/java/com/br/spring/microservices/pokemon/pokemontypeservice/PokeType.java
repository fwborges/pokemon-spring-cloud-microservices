package com.br.spring.microservices.pokemon.pokemontypeservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PokeType {

    @Id
    private Long id;

    @Column(name = "poke_type")
    private String type;

    @Column(name = "strength")
    private String strength;

    @Column(name = "weakness")
    private String weakness;

    private int port;

    public PokeType() {
    }

    public PokeType(Long id, String type, String strength, String weakness, int port) {
        this.id = id;
        this.type = type;
        this.strength = strength;
        this.weakness = weakness;
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
