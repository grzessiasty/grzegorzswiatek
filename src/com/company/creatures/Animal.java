package com.company.creatures;

import com.company.Human;
import com.company.Salleable;


public abstract class Animal implements Salleable {
    final public String species;
    public Double weight;
    public String name;


    public Animal(String species, Double weight, String name){
        this.species = species;
        this.weight = weight;
        this.name = name;
    }

    public String toString() {
        return "Imię: "+name+", gatunek: "+species+", waga: "+weight;
    }

    public void feed() {
        try {
            if (this.weight <= 0.0) {
                throw new Exception("Zwierzę nie żyje");
            } else {
                this.weight += 1.0;
                System.out.println("Zwierzę nakarmione.");
            }
        } catch (Exception feedEx) {
            System.err.println(feedEx);
        }
    }
    public void takeForAWalk(){
        try{
            if (this.weight == 0.0){
                throw new Exception("Zwierze nie żyje");
            }else{
                System.out.println("Zwierze wyprowadzone");
                if(this.weight == 1.0){
                    this.weight = 0.0;
                    System.out.println("Zwierze umiera :(");
                }else{
                    this.weight -= 1.0;
                }
            }
        } catch (Exception walkEx) {
            System.err.println(walkEx);
        }
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

    public abstract void feed(Double foodWeight);
}
