package InterfaceSegregationPrinciple.WithIsp;

/*
Interface Segregation Principle -
Clients should not be forced to depend on interfaces they do not use.
 */
public class Main {
    public static void main(String[] args) {
        // Testing BasicPrinter (only supports printing)
        Printer basicPrinter = new BasicPrinter();
        basicPrinter.printDocument("Basic Printer");

        // Testing AdvancedPrinter (supports all functions)
        AdvancedPrinter advancedPrinter = new AdvancedPrinter();
        advancedPrinter.printDocument("Advanced Printer");
        advancedPrinter.scanDocument("Advanced Printer");
        advancedPrinter.faxDocument("Advanced Printer");
        advancedPrinter.stapleDocument("Advanced Printer");
    }
}
