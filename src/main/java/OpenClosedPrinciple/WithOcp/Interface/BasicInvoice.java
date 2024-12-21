package OpenClosedPrinciple.WithOcp.Interface;


public class BasicInvoice implements InvoiceGenerator {

    @Override
    public void generateInvoice(double amount) {
        System.out.println("Generating basic invoice for amt " + amount);
    }
}

