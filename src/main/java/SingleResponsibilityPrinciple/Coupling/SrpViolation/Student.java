package SingleResponsibilityPrinciple.Coupling.SrpViolation;

// Coupling refers to how closely connected different modules, classes, or methods are to each other.
// Tight coupling
public class Student {
    private String studentId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void save() {
        // Database logic directly in student class
        System.out.println("Connecting to database...");
        System.out.println("Saving student with ID: " + studentId);
        // Other complex database code here
    }
}
