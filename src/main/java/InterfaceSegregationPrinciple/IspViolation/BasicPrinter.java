package InterfaceSegregationPrinciple.IspViolation;

/*
When classes implement an interface and include empty or unsupported methods, it’s a clear sign of an ISP violation.
Classes should not be forced to implement methods they won’t use.
 */
public class BasicPrinter implements Printer{
    @Override
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scanDocument(String document) {
        throw new UnsupportedOperationException("Basic printer can't scan documents");
    }

    @Override
    public void faxDocument(String document) {
        throw new UnsupportedOperationException("Basic Printer can't fax document");
    }

    @Override
    public void stapleDocument(String document) {
        throw new UnsupportedOperationException("Basic printer can't staple document");
    }
}
