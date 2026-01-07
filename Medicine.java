public class Medicine {
    private String medicineId;
    private String medicineName;
    private String dosage;
    public static int lowStockThreshold = 10;

    public Medicine() {
    }

    public Medicine(String id, String name) {
        this.medicineId = id;
        this.medicineName = name;
    }

    public int checkStock() {
        return 100;
    }
    // Getters / Setters...
}