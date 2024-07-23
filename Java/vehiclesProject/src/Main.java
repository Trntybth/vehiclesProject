import vehicles.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Car myCar = new Car("mercedez", "2024");
        myCar.start();
        myCar.drive();
    }
}