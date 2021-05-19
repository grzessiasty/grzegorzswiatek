package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {


        Human pato = new Human();
        pato.firstName = "Lukasz";
        pato.lastName = "Sztando";


        Car opel1 = new Car("Astra", "Opel");
        opel1.color = "Blue";
        opel1.type = "Sedan";
        opel1.value = 2000.0;

        Car opel2 = new Car("Astra", "Opel");
        opel2.color = "Blue";
        opel2.type = "Sedan";
        opel2.value = 2000.0;

        Animal dog = new Animal("bulldog", 10.0);
        dog.name = "Zwijka";

        Phone cegla = new Phone("Nokia", "3310", 2.4, "Nokiodroid");



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
        System.out.println(cegla);
        System.out.println(pato);

    }
}
