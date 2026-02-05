class Wallet {
    double balance = 500.0;

    void addFunds(double amount) {
        balance += amount;
        System.out.println("Wallet Balance: ₹" + balance);
    }

    boolean pay(double fare) {
        if (balance >= fare) {
            balance -= fare;
            return true;
        }
        return false;
    }
}
