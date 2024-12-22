package InterfaceSegregationPrinciple.IspViolation;

/*
Interface Segregation Principle -
Clients should not be forced to depend on interfaces they do not use.
 */
public interface Printer {
    void printDocument(String document);
    void scanDocument(String document);
    void faxDocument(String document);
    void stapleDocument(String document);
}
