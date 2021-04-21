package com.company;

import java.io.File;

public class Animal {
    final public String species;
    private Double weight;
    String name;
    File pic;

    public Animal(String species, Double weight){
        this.species = species;
        this.weight = weight; //konstruktor
    }

    void feed(){
        System.out.println("thx");
        this.weight += 1;
    }
}
