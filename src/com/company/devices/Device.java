package com.company.devices;
public abstract class Device {
    final String producer;
    final String model;
    public final int yearOfProduction;
    public Double value;

    public Device(String producer, String model, int yearOfProduction, Double value) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }
    abstract public void turnOn();
}