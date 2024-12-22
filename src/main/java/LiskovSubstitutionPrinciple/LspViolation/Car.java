package LiskovSubstitutionPrinciple.LspViolation;

public class Car {
    public void start() {
        System.out.println("Car is starting");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }

    public void refuel() {
        System.out.println("Car is refueling");
    }
}
