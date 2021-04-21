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
    }
}
