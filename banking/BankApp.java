package banking;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankUtils.showWelcome();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Initial Deposit: ");
        double amount = sc.nextDouble();

        System.out.println("Choose Account Type: 1.Savings  2.Current");
        int choice = sc.nextInt();

        BankAccount account; // Polymorphism

        if(choice == 1)
            account = new SavingsAccount(name, amount);
        else
            account = new CurrentAccount(name, amount);

        int option;
        do {
            BankUtils.printLine("MENU");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Bank Name");
            System.out.println("0. Exit");

            option = sc.nextInt();

            switch(option) {
                case 1:
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Amount to deposit: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Amount to withdraw: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 4:
                    account.showBankName();
                    break;
            }
        } while(option != 0);

        BankUtils.goodbye();
        sc.close();
    }
}