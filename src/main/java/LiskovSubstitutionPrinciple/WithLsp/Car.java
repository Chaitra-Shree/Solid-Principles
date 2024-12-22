package LiskovSubstitutionPrinciple.WithLsp;

public class Car extends Vehicle{
    @Override
    public void refuel() {
        System.out.println("Car is refueling with gasoline");
    }
}
