public class Student {
    private String studentId;
    private String fullName;
    private String faculty;
    private String congenitalDisease;
    public static int totalStudents = 0;

    // 2 Constructors
    public Student() {
        totalStudents++;
    }

    public Student(String id, String name) {
        this.studentId = id;
        this.fullName = name;
        totalStudents++;
    }

    // Getters / Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void requestService() {
        System.out.println("Service requested");
    }

    public void viewMedicalHistory() {
        System.out.println("Viewing history");
    }
}