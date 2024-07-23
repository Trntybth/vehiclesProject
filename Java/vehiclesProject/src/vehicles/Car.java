package vehicles;

public class Car extends Vehicle {

    public Car (String make, String model) { // constructor for subclasses
        super(make, model); // when this constructor is called, it creates a car object which is also a vehicle
        engine = new CarEngine();
    }
}
