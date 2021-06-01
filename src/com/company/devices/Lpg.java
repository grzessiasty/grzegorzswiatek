package com.company.devices;

public class Lpg  extends Car{

    public Lpg(String producer, String model, int yearOfProduction){
        super(producer, model, yearOfProduction);
    }
    @Override
    public void refuel(){
        System.out.println("Auto zostało zatankowane gazem LPG");
    }
}
