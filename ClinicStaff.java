public class ClinicStaff {
    private String staffId;
    private String name;
    public static int staffCount = 0;

    public ClinicStaff() {
        staffCount++;
    }

    public ClinicStaff(String id, String name) {
        this.staffId = id;
        this.name = name;
        staffCount++;
    }

    public void registerVisit(String studentId) {
        System.out.println("Registered student: " + studentId);
    }

    public void callQueue() {
        System.out.println("Next queue please");
    }
    // Getters / Setters...
}