package vehicles;

public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int speed;
    Engine engine;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void Start() {
        engine.Start();
    }

    public void drive() {
        if ((engine.running)) {
            accelerate();
        } else {
            System.out.println(make + " " + model + " is not running.");
        }
    }

    abstract void accelerate();

}

