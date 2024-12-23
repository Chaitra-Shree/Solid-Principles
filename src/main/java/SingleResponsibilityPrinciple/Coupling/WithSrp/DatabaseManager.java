package SingleResponsibilityPrinciple.Coupling.WithSrp;

public class DatabaseManager {
    public void saveToDatabase(String studentId) {
        // Logic for interacting with the database
        System.out.println("Connecting to database...");
        System.out.println("Saving student with ID: " + studentId);
        // Actual database save logic here
    }
}
