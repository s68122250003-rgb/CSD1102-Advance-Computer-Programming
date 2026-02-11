// Inheritance: Login สืบทอดมาจาก User
public class Login extends User {
    
    // Attributes สำหรับรับค่าตอนล็อกอิน
    private String inputUsername;
    private String inputPassword;

    // Constructor
    public Login(String username, String password) {
        this.inputUsername = username;
        this.inputPassword = password;
    }

    // Method loginStatus
    public boolean loginStatus() {

        // สมมติว่าดึงข้อมูล User จริงมาได้แล้วเช็ค
        if (this.inputUsername.equals(getUserUsername()) && 
            this.inputPassword.equals(getUserPassword())) {
            System.out.println("Login Successful!");
            return true;
        } else {
            System.out.println("Invalid credentials.");
            return false;
        }
    }
}
