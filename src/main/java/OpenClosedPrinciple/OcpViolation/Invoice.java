package OpenClosedPrinciple.OcpViolation;

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    /* Method to generate invoices -
     Suppose originally we had just one invoice basic, now if we need to add another international invoice,
     we need to modify this existing method by adding an if-else statement.
     This violates the Open Closed Principle.
    */
    public void generateInvoices(String type) {
        if(type.equals("basic")) {
            System.out.println("Generating basic invoice for amt " + amount);
        }
        else if(type.equals("international")) {
            System.out.println("Generating international invoice for amt " + amount);
        }
    }

    public void applyDiscount() {
        System.out.println("Applying discount for amt " + amount);
    }
}