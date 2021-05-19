package devices;

public class Car extends Device {

    public String color;
    public String type;
    public Double value;

    public Car (String model, String producer, int yearOfProduction){
        super(producer, model, yearOfProduction);

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
}
