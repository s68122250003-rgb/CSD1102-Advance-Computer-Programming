public class Visit {
    private String visitId;
    private String status;
    private double temperature;
    public static int visitCount = 0;

    public Visit() {
        visitCount++;
    }

    public Visit(String id, String status) {
        this.visitId = id;
        this.status = status;
        visitCount++;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
    // Getters / Setters...
}