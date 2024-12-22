package LiskovSubstitutionPrinciple.LspViolation;

/*
LSP Principle:
Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.
 */
public class Main {

    public static void main(String[] args) {
        // Creating instance of Car
        Car myCar = new Car();
        myCar.start();
        myCar.refuel();  // Works fine
        myCar.stop();

        // Creating instance of Electric Car
        Car myElectricCar = new ElectricCar(); // We are treating ElectricCar as car
        myElectricCar.start();
        // Here's the problem:
        // When we call the refuel() method, it throws an exception
        // because ElectricCar doesn't need refueling
        myElectricCar.refuel();
        myElectricCar.stop();  // Works, but refuel() breaks the program
    }
}
