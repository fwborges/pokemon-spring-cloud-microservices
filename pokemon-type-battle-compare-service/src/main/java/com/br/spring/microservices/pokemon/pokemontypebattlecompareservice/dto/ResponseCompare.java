package com.br.spring.microservices.pokemon.pokemontypebattlecompareservice.dto;

public class ResponseCompare {

    private String typeOne;

    private String typeTwo;

    private String winner;

    private String winnerWeakness;

    public ResponseCompare() {
    }

    public ResponseCompare(String typeOne, String typeTwo, String winner, String winnerWeakness) {
        this.typeOne = typeOne;
        this.typeTwo = typeTwo;
        this.winner = winner;
        this.winnerWeakness = winnerWeakness;
    }

    public String getTypeOne() {
        return typeOne;
    }

    public void setTypeOne(String typeOne) {
        this.typeOne = typeOne;
    }

    public String getTypeTwo() {
        return typeTwo;
    }

    public void setTypeTwo(String typeTwo) {
        this.typeTwo = typeTwo;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getWinnerWeakness() {
        return winnerWeakness;
    }

    public void setWinnerWeakness(String winnerWeakness) {
        this.winnerWeakness = winnerWeakness;
    }
}
