package OpenClosedPrinciple.WithOcp;

import OpenClosedPrinciple.WithOcp.Interface.InvoiceGenerator;

/*
Open Closed Principle:
Software entities (such as classes, modules, and functions) should be open for extension, but closed for modification.
 */
public class Invoice {
    private double amount;
    private InvoiceGenerator invoiceGenerator;

    // Constructor takes an InvoiceGenerator to delegate invoice generation
    public Invoice(double amount, InvoiceGenerator invoiceGenerator) {
        this.amount = amount;
        this.invoiceGenerator = invoiceGenerator;
    }

    public double getAmount() {
        return amount;
    }

    // Method to generate invoices
    //Delegate invoice generation to InvoiceGenerator
    public void generateInvoices() {
        invoiceGenerator.generateInvoice(amount);
    }

    public void applyDiscount() {
        System.out.println("Applying discount for amt " + amount);
    }
}