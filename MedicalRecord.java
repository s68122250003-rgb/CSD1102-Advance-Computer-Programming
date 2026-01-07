public class MedicalRecord {
    private String recordId;
    private String diagnosisDetail;
    public static String systemVersion = "v1.0";

    public MedicalRecord() {
    }

    public MedicalRecord(String id, String detail) {
        this.recordId = id;
        this.diagnosisDetail = detail;
    }

    public void saveRecord() {
        System.out.println("Record saved to database");
    }
    // Getters / Setters...
}