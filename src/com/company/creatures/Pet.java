package com.company.creatures;

public class Pet extends Animal {

    public Pet(String species, Double weight, String name){
        super(species, weight, name);
    }
    @Override
    public void feed(Double foodWeight){
        if (this.weight < 0.0 ){
            System.out.println("Zwierze nie żyje");
        }else {
            this.weight += foodWeight;
            System.out.println("Zwierze nakarmione. ("+foodWeight+"kg)");
        }
    }
}
