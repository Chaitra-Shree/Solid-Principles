package InterfaceSegregationPrinciple.IspViolation;

public class AdvancedPrinter implements Printer{
    @Override
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scanDocument(String document) {
        System.out.println("Scanning document: " + document);
    }

    @Override
    public void faxDocument(String document) {
        System.out.println("Faxing document: " + document);
    }

    @Override
    public void stapleDocument(String document) {
        System.out.println("Stapling document: " + document);
    }
}
