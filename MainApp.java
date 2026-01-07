public class MainApp {
    public static void main(String[] args) {
        // สร้าง Object จาก 2 Constructors ของ Student
        Student s1 = new Student(); // Constructor 1
        Student s2 = new Student("6401", "Somchai"); // Constructor 2

        // สร้าง Object จาก 2 Constructors ของ Doctor
        Doctor d1 = new Doctor();
        Doctor d2 = new Doctor("DOC01", "Dr. Joy", "Dentist");

        // เรียกใช้ Static Variable
        System.out.println("Total students: " + Student.totalStudents);
        System.out.println("Clinic name: " + Doctor.hospitalName);

        Nurse n1 = new Nurse();
        Nurse n2 = new Nurse("001","you");

        ClinicStaff c1 = new ClinicStaff();
        ClinicStaff c2 = new ClinicStaff("002","yui");

        MedicalRecord mr1 = new MedicalRecord();
        MedicalRecord mr2 = new MedicalRecord("001","รายละเอียดการวินิจฉัย");

        Medicine m1 = new Medicine();
        Medicine m2 = new Medicine("001","A");

        Visit v1 = new Visit();
        Visit v2 = new Visit("001","");
    }
}