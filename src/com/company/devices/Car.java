package com.company.devices;
import com.company.Human;
import com.company.Salleable;

public abstract class Car extends Device implements Salleable {

    public String color;
    public String type;
    public Double value;

    public Car (String producer, String model, int yearOfProduction, Double value){
        super(model, producer, yearOfProduction, value);

    }
    public String toString(){
        return "Producent: "+producer+", model: "+model+", kolor: "+color+", typ: "+type+", rok produkcji: "+yearOfProduction+", wartość: "+value;
    }
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if (getClass() != object.getClass()){
            return false;
        }
        Car car = (Car) object;
        return producer.equals(car.producer) && model.equals(car.model)&&color.equals(car.color)&&type.equals(car.type)&&value.equals(car.value);
    }
    public void turnOn(){
        System.out.println("Trwa uruchamianie: "+producer+" "+model);
    }
    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this)) {
            System.out.println("Nie masz samochodu");
        }
        if(!buyer.hasFreeSpace()){
            throw new Exception("Kupujący nie ma miejsca w garażu");
        }

        if (buyer.cash < price){
            throw new Exception("Kupujący ma za mało pieniędzy");
        }
        seller.removeCar(this);
        buyer.addCar(this);

        seller.cash += price;
        buyer.cash -= price;

        System.out.println("Samochód został sprzedany");
    }

    public abstract void refuel();
}

