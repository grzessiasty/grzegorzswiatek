package com.company.devices;

import com.company.Human;
import com.company.Salleable;

public class Phone extends Device implements Salleable {
    final Double screenSize;
    final String operatingSystem;

    public Phone(String producer, String model, Double screenSize, String operatingSystem, int yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    public String toString() {
        return "Producent: "+producer+", model: "+model+", ekran: "+screenSize+", system: "+operatingSystem+", rok produkcji: "+yearOfProduction;
    }

    @Override
    public void turnOn() {
        System.out.println("Trwa uruchamianie: "+producer+" "+model);
    }
    @Override
    public void sell(Human seller, Human buyer, Double price){
        if (seller.mobilePhone != this) {
            System.out.println("Nie posiadasz telefonu.");
        }else if (buyer.cash<price){
            System.out.println("Kupujący ma za mało gotówki.");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.mobilePhone = seller.mobilePhone;
            seller.mobilePhone = null;

            System.out.println("Telefon został sprzedany!");
        }
    }
}
