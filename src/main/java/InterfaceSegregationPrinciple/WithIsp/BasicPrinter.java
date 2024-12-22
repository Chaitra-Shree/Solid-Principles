package InterfaceSegregationPrinciple.WithIsp;

public class BasicPrinter implements Printer{
    @Override
    public void printDocument(String document) {
        System.out.println("Printing document " + document);
    }
}
