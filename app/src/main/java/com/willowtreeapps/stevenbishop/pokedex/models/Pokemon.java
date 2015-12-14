package com.willowtreeapps.stevenbishop.pokedex.models;

/**
 * Created by stevenbishop on 11/24/15.
 */
public class Pokemon {
    private int id;
    public String name;
    public String attack;
    public String defense;
    public String resource_uri;

    public Pokemon() {}

    public Pokemon(String name, String attack, String defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

    public void setName(String name) {this.name = name;}
    public void setAttack(String attack) {this.attack = attack;}
    public void setDefence(String defence) {this.defense = defence;}

    public String getName() {return this.name;}
    public String getAttack() {return  this.attack;}
    public String getDefense() {return this.defense;}
}
