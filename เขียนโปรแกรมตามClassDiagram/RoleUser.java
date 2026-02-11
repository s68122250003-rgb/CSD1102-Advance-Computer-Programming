public enum RoleUser {
    PUBLIC_RELATION("PublicRelation"),
    DIVISION("Division"),
    MANAGER("Manager");

    private final String value;

    RoleUser(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
