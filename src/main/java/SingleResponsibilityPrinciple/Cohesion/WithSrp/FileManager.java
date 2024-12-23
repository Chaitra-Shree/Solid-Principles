package SingleResponsibilityPrinciple.Cohesion.WithSrp;

// High Cohesion
public class FileManager {
    public void writeToFile(String data) {
        // Logic to write data to a file
    }

    public String readFromFile(String fileName) {
        // Logic to read data from a file
        return fileName;
    }
}
