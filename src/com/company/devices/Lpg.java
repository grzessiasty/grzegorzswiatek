package com.company.devices;

public class Lpg  extends Car{

    public Lpg(String producer, String model, int yearOfProduction, Double value){
        super(producer, model, yearOfProduction, value);
    }
    @Override
    public void refuel(){
        System.out.println("Auto zostało zatankowane gazem LPG");
    }
}
