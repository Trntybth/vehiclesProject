package vehicles;

public class Car extends Vehicle {

    public Car (String make, String model) { // constructor for subclasses
        super(make, model); // when this constructor is called, it creates a car object which is also a vehicle
        engine = new CarEngine();
    }

    @Override
    void accelerate() { //copy and pasted code from north-coders
        String message = make + " " + model + " speed: ";
        double fuelMod = switch (this.engine.fuelType) {
            case "Unleaded" -> 1.5D;
            case "Leaded" -> 1.2D;
            case "Diesel" -> 1.8D;
            default -> throw new IllegalStateException("Unexpected value: " + this.engine.fuelType);
        };
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println(message + String.format("%.2f", (engine.horsepower * fuelMod) * Math.exp(Math.sqrt(i)) / 2));
        }
    }


}
