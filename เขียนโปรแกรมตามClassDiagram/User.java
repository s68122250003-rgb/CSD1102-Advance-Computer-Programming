import java.util.*;
public class User {
    private int user_id;
    private int department_id;
    private String user_username;
    private String user_password;
    private String user_name;
    private Gender user_gender; // เชื่อมโยงกับ Enum Gender
    private String user_email;
    private RoleUser user_role; // เชื่อมโยงกับ Enum RoleUser

    public User(){

    }
    public User(int userid,int department_id, String username, String password, String name, Gender userGender, String emali, RoleUser userRole){
        this.user_id = userid;
        this.department_id = department_id;
        this.user_username = username;
        this.user_password = password;
        this.user_name = name;
        this.user_gender = userGender;
        this.user_email = emali;
        this.user_role = userRole;
    }
    public String getUserUsername(){
        return this.user_username;
    }
    public String getUserPassword(){
        return this.user_password;
    }

    public void userLogin() {
        // ตรรกะสำหรับการยืนยันตัวตน
    }

    public void addProposal() {
        // เพิ่มข้อเสนอใหม่เข้าระบบ
    }

    public void viewProposal() {
        // ดูรายละเอียดข้อเสนอ
    }

    public void confirmProposal() {
        // อนุมัติหรือยืนยันข้อเสนอ (มักใช้โดย Manager)
    }

    public void creatReports() {
        // สร้างรายงานสรุปผล
    }

    public void viewReports() {
        // เรียกดูรายงานที่มีอยู่
    }

    public void updateDepartment() {
        // อัปเดตข้อมูลแผนกที่สังกัด
    }
}
