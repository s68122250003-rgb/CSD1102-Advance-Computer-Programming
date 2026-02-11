public class Department {
    // --- Attributes ---
    private int department_id;
    private String department_name;

    // --- Constructor ---
    public Department(int id, String name) {
        this.department_id = id;
        this.department_name = name;
    }

    // --- Getter Methods ---
    public int getDepartmentId() {
        return department_id;
    }

    public String getDepartmentName() {
        return department_name;
    }

    // --- Methods ตาม Diagram ---
    public void insertDepartment() {
        System.out.println("Inserting new department: " + department_name);
    }

    public void updateDepartment() {
        System.out.println("Updating department ID: " + department_id);
    }

    public void deleteDepartment() {
        System.out.println("Deleting department ID: " + department_id);
    }
}
