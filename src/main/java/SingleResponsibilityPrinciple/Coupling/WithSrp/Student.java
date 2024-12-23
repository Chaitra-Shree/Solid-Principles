package SingleResponsibilityPrinciple.Coupling.WithSrp;

public class Student {
    private String studentId;
    private DatabaseManager databaseManager;  // Dependency on DatabaseManager

    public Student(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void save() {
        // Delegate db operations to DBManager
        databaseManager.saveToDatabase(studentId);
    }
}
