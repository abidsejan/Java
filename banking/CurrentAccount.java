package banking;

public class CurrentAccount extends BankAccount implements Transaction {

    private double overdraftLimit = 1000;

    public CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if(balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}