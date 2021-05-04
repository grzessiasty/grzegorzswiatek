package com.company;

public class Main {

    public static void main(String[] args) {


        Human pato = new Human();
        pato.firstName = "Lukasz";
        pato.lastName = "Sztando";
        pato.pet = new Animal("Chicken", 5.5);


        System.out.println(pato.firstName);
        System.out.println(pato.pet.name);


        pato.pet = new Animal("Canic", 13.0);

        Car opel = new Car("Astra", "Opel");
        opel.color = "Blue";
        opel.type = "Sedan";
        opel.value = 2000.0;

        System.out.println(opel.producer + " " + opel.model);

        //pato.car = opel;
        //System.out.println("Moje auto to: " + opel.producer + " " + opel.model);

        pato.setSalary(2500.0);
        pato.getSalary();
        pato.setSalary(3000.0);
        pato.setCar(opel);

    }
}
