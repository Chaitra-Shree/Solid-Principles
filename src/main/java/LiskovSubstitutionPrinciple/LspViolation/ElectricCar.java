package LiskovSubstitutionPrinciple.LspViolation;

public class ElectricCar extends Car{

    @Override
    public void refuel() {
        // Electric cars don't use fuel, so what do we do here?
        throw new UnsupportedOperationException("Electric cars don't need refueling");
    }

    public void recharge() {
        System.out.println("Car is recharging");
    }
}
