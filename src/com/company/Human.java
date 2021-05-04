package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Phone mobilePhone;
    Car car;
    private Double salary;

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
        System.out.println("Nowe dane zostały wysłane do sytemu księgowego");
        System.out.println("Proszę odebrać aneks od pani Hani");
        System.out.println("Nie ukrywaj dochodu bo mendy z ZUS i US wszystko wiedzą");
        this.salary = salary;
    }
}
