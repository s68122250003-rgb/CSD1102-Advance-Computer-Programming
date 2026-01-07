public class Nurse {
    private String nurseId;
    private String name;
    public static int nurseCount = 0;

    public Nurse() {
        nurseCount++;
    }

    public Nurse(String id, String name) {
        this.nurseId = id;
        this.name = name;
        nurseCount++;
    }

    public void measureVitals(String visitId) {
        System.out.println("Measuring vitals for " + visitId);
    }

    public void recordInitialSymptoms(String symptoms) {
        System.out.println("Symptoms recorded");
    }
    // Getters / Setters...
}