package vehicles;

public class Motorcycle extends Vehicle {

    public Motorcycle(String make, String model, boolean hasSideCar) {
        super(make, model);
        engine = new MotorcycleEngine(); //this works because engine object created as a field of vehicle, we give it a carEngine object in this field.
    }
}
