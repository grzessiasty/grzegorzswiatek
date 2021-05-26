package com.company;

import java.io.File;

public class Animal implements Salleable{
    final public String species;
    private Double weight;
    String name;
    File pic;

    public Animal(String species, Double weight){
        this.species = species;
        this.weight = weight; //konstruktor
    }

    public String toString() {
        return "Imię: "+name+", gatunek: "+species+", waga: "+weight;
    }

    void feed(){
        System.out.println("thx");
        this.weight += 1;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price){
        if (seller.pet != this) {
            System.out.println("Nie posiadasz zwierząt");
        }else if (buyer.cash<price){
            System.out.println("Kupujący ma za mało gotówki.");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.pet = seller.pet;
            seller.pet = null;

            System.out.println("Zwierze zostało sprzedane!");
        }
    }
}
