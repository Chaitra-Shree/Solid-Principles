package LiskovSubstitutionPrinciple.Composition.WithLsp;

// Class for flying birds that uses the Flyable interface
public class Sparrow extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
