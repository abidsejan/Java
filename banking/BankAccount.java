package banking;

public abstract class BankAccount {

    private String accountHolder;
    private int accountNumber;
    protected double balance;

    // static variable (shared by all objects)
    protected static int nextAccountNumber = 1000;

    // final variable (cannot change)
    protected final String bankName = "Global Trust Bank";

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = nextAccountNumber++;
    }

    // Getter methods (Encapsulation)
    public String getAccountHolder() { return accountHolder; }
    public int getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    // final method (cannot override)
    public final void showBankName() {
        System.out.println("Bank: " + bankName);
    }

    // Abstract methods (Abstraction)
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}