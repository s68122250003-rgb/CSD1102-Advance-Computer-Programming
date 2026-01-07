public class Doctor {
    private String doctorId;
    private String name;
    private String specialty;
    public static String hospitalName = "Health Clinic";

    public Doctor() {
    }

    public Doctor(String id, String name, String spec) {
        this.doctorId = id;
        this.name = name;
        this.specialty = spec;
    }

    public void diagnose(String visitId) {
        System.out.println("Diagnosing...");
    }

    public void prescribeMedicine() {
        System.out.println("Medicine prescribed");
    }

    public void authorizeCertificate() {
        System.out.println("Certificate authorized");
    }
    // Getters / Setters...
}