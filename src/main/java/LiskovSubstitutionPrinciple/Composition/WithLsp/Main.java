package LiskovSubstitutionPrinciple.Composition.WithLsp;

/*
 We explored how using inheritance can sometimes violate the Liskov Substitution Principle.
 Another way to follow LSP without falling into the pitfalls of inheritance is by using composition over inheritance.
 This method allows you to design systems that are more flexible and avoid situations where subclasses cannot properly fulfill the parent class's contract.
 */
public class Main {
    public static void main(String[] args) {
        // Creating a sparrow that can fly
        Sparrow mySparrow = new Sparrow();
        mySparrow.eat();
        mySparrow.fly(); // works because sparrows can fly

        // Creating penguins that can fly
        Penguin myPenguin = new Penguin();
        myPenguin.eat();
        // myPenguin.fly();   // This will not compile, as Penguins do not have fly() method
    }
}
