package com.company.devices;

import com.company.Human;
import com.company.Salleable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device implements Salleable {
    final Double screenSize;
    final String operatingSystem;

    static final String DEFAULT_PROTOCOL = "https";
    static final String DEFAULT_ADDRESS = "127.0.0.1";
    static final String DEFAULT_VERSION = "latest";


    public Phone(String producer, String model, Double screenSize, String operatingSystem, int yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, value);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    public String toString() {
        return "Producent: "+producer+", model: "+model+", ekran: "+screenSize+", system: "+operatingSystem+", rok produkcji: "+yearOfProduction;
    }

    @Override
    public void turnOn() {
        System.out.println("Trwa uruchamianie: "+producer+" "+model);
    }
    @Override
    public void sell(Human seller, Human buyer, Double price){
        if (seller.mobilePhone != this) {
            System.out.println("Nie posiadasz telefonu.");
        }else if (buyer.cash<price){
            System.out.println("Kupujący ma za mało gotówki.");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.mobilePhone = seller.mobilePhone;
            seller.mobilePhone = null;

            System.out.println("Telefon został sprzedany!");
        }
    }

    public void installAnApp(String app) {
        this.installAnApp(app, DEFAULT_VERSION);
    }
    public void installAnApp(String app, String version) {
        this.installAnApp(app, version, DEFAULT_ADDRESS);
    }
    public void installAnApp(String app, String version, String address) {
        URL appLink = null;
        try {
            appLink = new URL(DEFAULT_PROTOCOL, address, app +" "+ version);
            this.installAnApp(appLink);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public void installAnApp(URL appURL) {
        System.out.println("Aplikacja " + appURL.getFile() + " została pobrana! Adres: " + appURL.getHost());

    }
    public void installAnApp(List<String> applications) {
        String[] array = new String[applications.size()];
        array = applications.toArray(array);
        this.installAnApp(array);
    }
    public void installAnApp(String[] applications) {
        for (String appName: applications) {
            this.installAnApp(appName);
        }
    }

}
