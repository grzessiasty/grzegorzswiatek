package com.company;
import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Human implements Salleable {
    String firstName;
    String lastName;
    public Animal pet;
    public Phone mobilePhone;
    private Car car;
    private Double salary;
    public Double cash;

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

    public Car getCar(){
        return this.car;
    }
    public void setCar(Car car) {
        if (this.salary > car.value){
            System.out.println("Twoje zarobki są wyższe niż wartość auta. Udało się kupić za gotówkę!");
            this.car = car;
            return;
        }
        if(this.salary > (car.value/12)) {
            System.out.println("Kupiłeś auto ale teraz płać kredyt :(");
            this.car = car;
            return;
        }
        System.out.println("Jesteś za biedny na auto, Z buta też fajnie sie chodzi.");

    }
    public void delCar(){
        this.car = null;
    }
    @Override
    public void sell(Human seller, Human buyer, Double price){
        System.out.println("Nie możesz sprzedawać ludzi");
    }
}
