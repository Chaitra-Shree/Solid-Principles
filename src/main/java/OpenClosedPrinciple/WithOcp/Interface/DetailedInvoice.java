package OpenClosedPrinciple.WithOcp.Interface;

public class DetailedInvoice implements InvoiceGenerator{

    @Override
    public void generateInvoice(double amount) {
        System.out.println("Generating Detailed invoice for amt " + amount);
    }
}
