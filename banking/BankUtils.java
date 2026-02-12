package banking;

public class BankUtils {

    // Static method
    public static void showWelcome() {
        System.out.println("Welcome to Global Trust Bank System");
    }

    // Method Overloading
    public static void printLine() {
        System.out.println("-------------------------------");
    }

    public static void printLine(String title) {
        System.out.println("---- " + title + " ----");
    }

    // final static method
    public final static void goodbye() {
        System.out.println("Thank you for banking with us!");
    }
}