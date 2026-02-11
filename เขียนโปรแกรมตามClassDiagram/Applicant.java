public class Applicant {
    private int applicantId;
    private String applicantName;
    private String applicantJob;
    private String applicantAddress;
    private Gender applicantGender; // เรียกใช้ Enum Gender
    private String applicantTel;    // ปรับจาก char เป็น String

    // Constructor
    public Applicant(int id, String name, Gender gender) {
        this.applicantId = id;
        this.applicantName = name;
        this.applicantGender = gender;
    }

    // Methods
    public void insertApplicant() {
        // Logic บันทึกข้อมูลลง Database
        System.out.println("Saving applicant: " + applicantName);
    }

    public void updateApplicant() {
        // Logic อัปเดตข้อมูล
    }

    public void deleteApplicant() {
        // Logic ลบข้อมูล
    }
}
