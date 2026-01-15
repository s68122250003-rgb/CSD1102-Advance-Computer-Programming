package CaseStudy;

public class GameCharacter {
    // TODO 2.1:
    // ประกาศตัวแปร instance
    private String name;
    private String role;
    private PowerLevel powerLevel;

    // TODO 2.2:
    // ประกาศ static variable เพื่อนับจ านวนตัวละครทั้งหมด
    private static int count;

    // TODO 2.3:
// เขียน constructor รับค่า name, role, powerLevel
// และเพิ่มค่าจ านวนตัวละคร
    public GameCharacter(String name,String role,PowerLevel powerLevel){
        this.name = name;
        this.role = role;
        this.powerLevel = powerLevel;
        ++count;

    }

    // TODO 2.4:
    // เขียน static method getTotalCharacters()
    // คืนค่าจ านวนตัวละครทั้งหมด
    public static int getTotalCharalCharacters(){
        return count;
    }
    // TODO 2.5:
    // เขียน method displayInfo()
    // แสดงข้อมูลตัวละคร:
    public void displayInfo(){
        System.out.println("name: "+this.name);
        System.out.println("role: "+this.role);
        System.out.println("powerLevel: "+this.powerLevel);
        System.out.println("-----------------------------------------");
    }

}
