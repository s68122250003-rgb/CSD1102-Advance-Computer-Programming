class ATMSimulator {

    public static void withdraw(double balance, double amount) {

        if (amount > balance) {
            throw new MyTestException("Insufficient balance", 2001);
        }

        System.out.println("Withdraw successful");
    }
}