package devices;

public class Car {

    public final String model;
    public final String producer;
    public String color;
    public String type;
    public Double value;

    public Car (String model, String producer){

        this.model = model;
        this.producer = producer;
    }
    public String toString(){
        return "Producent: "+producer+", model: "+model+", kolor: "+color+", typ: "+type+", wartość: "+value;
    }
    @Override
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
}
