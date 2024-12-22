package LiskovSubstitutionPrinciple.WithLsp;

public class ElectricCar extends Vehicle{

    @Override
    public void refuel() {
        // Call recharge() instead of refueling with gasoline
        recharge();
    }

    // Electric cars need to recharge instead of refuel
    private void recharge() {
        System.out.println("Electric car is recharging");
    }

    /*
    Key Takeaways
The Second Example Works Because:

Vehicle is abstract and generic, making it suitable for polymorphism and extensions.
The meaning of refuel() is explicitly tied to energy replenishment, not just fuel.
Subclasses fulfill the contract of Vehicle without breaking the program or introducing semantic confusion.
The First Example Breaks LSP Because:

Car is not designed to represent a general vehicle. It assumes all vehicles use fuel.
Overriding refuel() to mean "recharge" creates a semantic and functional mismatch.
     */
}
