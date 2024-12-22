package LiskovSubstitutionPrinciple.Composition.LspViolation;

public class Penguin extends Bird{
    @Override
    public void fly() {
        // Penguins can't fly, so this breaks the substitution
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}
