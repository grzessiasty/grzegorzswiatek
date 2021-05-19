package devices;

public class Phone extends Device{
    final Double screenSize;
    final String operatingSystem;

    public Phone(String producer, String model, Double screenSize, String operatingSystem, int yearOfProduction) {
        super(producer, model, yearOfProduction);
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
}
