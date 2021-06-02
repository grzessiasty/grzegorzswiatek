package com.company;

import com.company.creatures.Animal;
import com.company.devices.*;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        Car opel1 = new Lpg("Opel", "Astra",2000, 2000.0);
        opel1.color = "Blue";
        opel1.type = "Sedan";
        opel1.value = 2000.0;

        Car opel2 = new Lpg("Opel", "Astra",2000, 2000.0);
        opel2.color = "Blue";
        opel2.type = "Sedan";
        opel2.value = 2000.0;

        Car maluch = new Electric("Fiat", "126p", 2021, 5000.0);
        Car sharan = new Diesel("VW", "Sharan", 2005, 3000.0);

        Animal dog = new Pet("bulldog", 10.0, "Zwijka");
        FarmAnimal chicken = new FarmAnimal("kura",3.0,"Koko");


        Phone nokia = new Phone("Nokia", "3310", 2.4, "Nokiodroid", 2002, 500.0);


        Human pato = new Human("Lukasz", "Sztando", 3);
        pato.cash = 1945.0;
        pato.mobilePhone = nokia;
        pato.pet = dog;

        Human ecik = new Human("Ecik", "Kleve", 2);
        ecik.cash = 2000.0;

        Human pedzik = new Human("Pedzik", "Pedzikowski", 3);
        pedzik.setSalary(5000.0);
        pedzik.cash = 10000.0;

        pato.setSalary(2500.0);
        pato.getSalary();
        pato.setSalary(3000.0);
        pato.setCar(opel1, 0);

        System.out.println("Czy samochody są takie same?: " + opel1.equals(opel2));
        System.out.println(dog);
        System.out.println(opel1);
        System.out.println(opel2);
        System.out.println(nokia);
        System.out.println(pato);

        nokia.turnOn();
        opel1.turnOn();

        dog.sell(pato, ecik, 3000.0);


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

        pedzik.setCar(opel1, 0);
        pedzik.setCar(maluch, 1);
        pedzik.setCar(sharan, 2);
        System.out.println(pedzik.sort());
        maluch.sell(pedzik, pato, 1900.0);
        pedzik.removeCar(maluch);

    }
}
