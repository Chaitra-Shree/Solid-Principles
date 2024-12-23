package SingleResponsibilityPrinciple.Cohesion.SrpViolation;

// Cohesion refers to how closely related and focused the responsibilities of a class, module, or method are.
// Low Cohesion
public class UserManager {
    public void addUser(String user) {
        // Logic to add a user
    }

    public void deleteUser(String user) {
        // Logic to delete a user
    }

    public void writeToFile(String data) {
        // Logic to write data to a file
    }

    public String readFromFile(String fileName) {
        // Logic to read data from a file
        return fileName;
    }
}
