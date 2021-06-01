package com.company;

import com.company.creatures.Animal;
import com.company.devices.*;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Car opel1 = new Lpg("Opel", "Astra",2000);
        opel1.color = "Blue";
        opel1.type = "Sedan";
        opel1.value = 2000.0;

        Car opel2 = new Lpg("Opel", "Astra",2000);
        opel2.color = "Blue";
        opel2.type = "Sedan";
        opel2.value = 2000.0;

        Car maluch = new Electric("Fiat", "126p", 2021);
        Car sharan = new Diesel("VW", "Sharan", 2005);

        Animal dog = new Pet("bulldog", 10.0, "Zwijka");
        FarmAnimal chicken = new FarmAnimal("kura",3.0,"Koko");


        Phone nokia = new Phone("Nokia", "3310", 2.4, "Nokiodroid", 2002);


        Human pato = new Human();
        pato.firstName = "Lukasz";
        pato.lastName = "Sztando";
        pato.cash = 1945.0;
        pato.mobilePhone = nokia;
        pato.pet = dog;

        Human ecik = new Human();
        ecik.cash = 2000.0;
        ecik.firstName = "Ecik z Kleve";
        //System.out.println(opel1.producer + " " + opel1.model);

        //pato.car = opel;
        //System.out.println("Moje auto to: " + opel.producer + " " + opel.model);

        pato.setSalary(2500.0);
        pato.getSalary();
        pato.setSalary(3000.0);
        pato.setCar(opel1);

        System.out.println("Czy samochody są takie same?: " + opel1.equals(opel2));
        System.out.println(dog);
        System.out.println(opel1);
        System.out.println(opel2);
        System.out.println(nokia);
        System.out.println(pato);

        nokia.turnOn();
        opel1.turnOn();

        dog.sell(pato, ecik, 3000.0);
        opel2.sell(pato, ecik, 1500.0);

        System.out.println("Telefon sprzedającego: "+pato.mobilePhone);
        System.out.println("Telefon kupującego: "+ecik.mobilePhone);
        nokia.sell(pato,ecik,500.0);
        System.out.println("Telefon sprzedającego: "+pato.mobilePhone);
        System.out.println("Telefon kupującego: "+ecik.mobilePhone);

        ecik.sell(pato,ecik,300.0);

        dog.takeForAWalk();
        dog.feed();
        dog.feed(2.0);
        chicken.feed();
        chicken.feed(3.5);
        chicken.beEaten();

        List<String> apps = new ArrayList<>();
        apps.add("Facebook");
        apps.add("Instagram");

        nokia.installAnApp("Snapchat");
        nokia.installAnApp("Twitter", "4.2.0");
        nokia.installAnApp("McDonald's", "19.45", "192.168.0.1");
        nokia.installAnApp(apps);

        opel1.refuel();
        maluch.refuel();
        sharan.refuel();
    }
}
