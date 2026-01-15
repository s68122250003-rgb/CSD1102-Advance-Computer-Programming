package CaseStudy;

public class GameDemo {
    public static void main(String[] args) {
        
        GameCharacter c1 = new GameCharacter("Aragon", "Warrior", PowerLevel.HIGH);
        c1.displayInfo();
        GameCharacter c2 = new GameCharacter("Elena", "Mage", PowerLevel.MEDIUM);
        c2.displayInfo();
        GameCharacter c3 = new GameCharacter("Luna", "Archer", PowerLevel.LEGENDARY);
        c3.displayInfo();

        
    }
}
