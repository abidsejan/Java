package banking;

public class SavingsAccount extends BankAccount implements Transaction {

    private static final double MIN_BALANCE = 500; // static + final

    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    // Method Overriding
    @Override
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if(balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Minimum balance must be 500!");
        }
    }
}