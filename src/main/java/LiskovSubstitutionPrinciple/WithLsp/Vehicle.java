package LiskovSubstitutionPrinciple.WithLsp;

public abstract class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }

    // abstract method for fuel/energy behaviour
    public abstract void refuel();
}
