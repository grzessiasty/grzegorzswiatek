package com.company;
import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.Device;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Human implements Salleable {
    public final String firstName;
    public final String lastName;
    public Animal pet;
    public Phone mobilePhone;
    private Double salary;
    public  Double cash;
    public Car[] garage;

    public Human(String firstName, String lastName, int garageSize){
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[garageSize];
    }

    public String toString() {
        return "Imie: "+firstName+", nazwisko: "+lastName;
    }

    public Double getSalary(){
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();

        System.out.println("Dane o wypłacie były pobierane " + date.format(time) + " Jej wartość to: " + this.salary);
        return this.salary;
    }


    public void setSalary(Double salary){
        if (salary <= 0){
            try {
                throw new Exception("Pracujesz i jeszcze musisz dopłacać do pracy?");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Teraz zarabiasz " + salary);
        System.out.println("Nowe dane zostały wysłane do sytemu księgowego");
        System.out.println("Proszę odebrać aneks od pani Hani");
        System.out.println("Nie ukrywaj dochodu bo mendy z ZUS i US wszystko wiedzą");
        this.salary = salary;
    }

        public void setCar(Car car, int id) {
        this.garage[id] = car;
    }

    public Double getValue() {
        Double value = 0.0;

        for (Device vehicle : this.garage) {
            value += vehicle.value;
        }

        return value;
    }
    public List<Car> sort() {
        return Arrays.stream(garage)
                .sorted(Comparator.comparing(car -> car.yearOfProduction))
                .collect(Collectors.toList());
    }
    public boolean hasCar(Car newCar){
        for (Car car: garage) {
            if(car == newCar) return true;
        }
        return false;
    }
    public boolean hasFreeSpace(){
        for (Car car: garage) {
            if(car == null) return true;
        }
        return false;
    }
    public void addCar(Car newCar){
        for (int i = 0; i < garage.length; i++){
            if (this.garage[i] == null){
                this.garage[i] = newCar;
            }
        }
    }
    public void removeCar(Car carRemove) {
        for (int i = 0; i < garage.length; i++) {
            if (this.garage[i] == carRemove) {
                this.garage[i] = null;
            }
        }
    }


    @Override
    public void sell(Human seller, Human buyer, Double price){
        System.out.println("Nie możesz sprzedawać ludzi");
    }
}
