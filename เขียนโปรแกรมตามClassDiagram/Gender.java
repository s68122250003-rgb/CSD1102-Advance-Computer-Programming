public enum Gender {
    MALE("M"),
    FEMALE("F");

    private final String value;

    // Constructor สำหรับ Enum เพื่อกำหนดค่า String
    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
