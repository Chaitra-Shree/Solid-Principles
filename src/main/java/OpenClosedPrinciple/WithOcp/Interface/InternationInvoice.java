package OpenClosedPrinciple.WithOcp.Interface;

public class InternationInvoice implements InvoiceGenerator {

    @Override
    public void generateInvoice(double amount) {
        System.out.println("Generating International invoice for amt " + amount);
    }
}
