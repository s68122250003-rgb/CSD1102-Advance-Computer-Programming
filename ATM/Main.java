public class Main {
    public static void main(String[] args) {

        double balance = 5000;
        double amount = 7000;

        try {
            ATMSimulator.withdraw(balance, amount);
        } catch (MyTestException e) {
            System.out.println("Error code: " + e.getErrorCode());
            System.out.println("Message: " + e.getMessage());
        }
    }
}