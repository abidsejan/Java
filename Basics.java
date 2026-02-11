import java.util.Scanner;

public class Basics {
    // Method with no return value
    public static void greetUser(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    // Method with return value
    public static int addNumbers(int x, int y) {
        return x + y;
    }

    // Method to show array
    public static void printArray(int[] arr) {
        System.out.println("Array elements are:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void mathMethods(){
        int a = 10;
        int b = 3;
        double x = -5.7;
        double y = 2.3;

        // Absolute value
        System.out.println("abs(x): " + Math.abs(x));

        // Maximum & Minimum
        System.out.println("max(a, b): " + Math.max(a, b));
        System.out.println("min(a, b): " + Math.min(a, b));

        // Power
        System.out.println("a^b: " + Math.pow(a, b));

        // Square root
        System.out.println("sqrt(25): " + Math.sqrt(25));

        // Cube root
        System.out.println("cbrt(27): " + Math.cbrt(27));

        // Rounding
        System.out.println("round(x): " + Math.round(x));
        System.out.println("ceil(y): " + Math.ceil(y));
        System.out.println("floor(y): " + Math.floor(y));

        // Random number (0.0 to 1.0)
        System.out.println("random(): " + Math.random());

        // Trigonometry (input in radians)
        double angle = Math.toRadians(30);
        System.out.println("sin(30°): " + Math.sin(angle));
        System.out.println("cos(30°): " + Math.cos(angle));
        System.out.println("tan(30°): " + Math.tan(angle));

        // Inverse trigonometry
        System.out.println("asin(0.5): " + Math.asin(0.5));
        System.out.println("acos(0.5): " + Math.acos(0.5));
        System.out.println("atan(1): " + Math.atan(1));

        // Logarithms
        System.out.println("log(10): " + Math.log(10));      // natural log
        System.out.println("log10(100): " + Math.log10(100));

        // Exponential
        System.out.println("exp(2): " + Math.exp(2));

        // Sign
        System.out.println("signum(x): " + Math.signum(x));

        // Degree ↔ Radian conversion
        System.out.println("Radians of 180: " + Math.toRadians(180));
        System.out.println("Degrees of PI: " + Math.toDegrees(Math.PI));

        // Constants
        System.out.println("PI: " + Math.PI);
        System.out.println("E: " + Math.E);

        // Hypotenuse
        System.out.println("hypot(3,4): " + Math.hypot(3,4));

        // Copy sign
        System.out.println("copySign(5, -1): " + Math.copySign(5, -1));

        // Exact arithmetic (overflow-safe)
        System.out.println("addExact(5, 10): " + Math.addExact(5,10));
        System.out.println("multiplyExact(5, 4): " + Math.multiplyExact(5,4));
    }

    // MAIN METHOD
    public static void main(String[] args) {

        System.out.println("===== JAVA COMPLETE BASICS DEMO =====");

        // ===== VARIABLES & DATA TYPES =====
        int age = 20;
        float height = 5.5f;
        double gpa = 3.8;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Abid";

        System.out.println("--- Variables ---");
        System.out.println(name + " | " + age + " | " + gpa + " | " + grade + " | " + isStudent + " | " + height);

        // ===== TYPE CASTING =====
        System.out.println("--- Type Casting ---");
        int a = 10;
        double b = a;  
        
        // implicit
        System.out.println("Implicit: " + b);
        double price = 9.99;
        int whole = (int) price;  
        
        // explicit
        System.out.println("Explicit: " + whole);

        // ===== OPERATORS =====
        System.out.println("\n--- Operators ---");
        int x = 8, y = 3;

        System.out.println("Arithmetic: " + (x + y) + ", " + (x - y) + ", " + (x * y) + ", " + (x / y));
        System.out.println("Relational x>y: " + (x > y));
        System.out.println("Logical true && false: " + (true && false));
        System.out.println("Bitwise x&y: " + (x & y));

        // ===== == vs .equals() =====
        System.out.println("--- == vs .equals() ---");
        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println("== : " + (s1 == s2));
        System.out.println(".equals(): " + s1.equals(s2));

        // IF-ELSE
        System.out.println("--- if-else ---");
        int marks = 75;
        if (marks >= 80) {
            System.out.println("A Grade");
        } else {
            System.out.println("Below A");
        }

        // SWITCH CASE
        System.out.println("--- switch case ---");
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // LOOPS
        System.out.println("--- for loop ---");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        System.out.println("--- while loop ---");
        int i = 1;
        while (i <= 2) {
            System.out.println(i);
            i++;
        }

        System.out.println("--- do-while loop ---");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 2);

        // ===== ARRAYS =====
        System.out.println("--- Arrays ---");

        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("First element: " + numbers[0]);

        printArray(numbers);  // method call

        int [][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matrix element at (2,3): " + matrix[1][2]);
        System.out.println("Matrix elements:");
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
        // ===== METHODS CALL =====
        System.out.println("--- Methods ---");
        greetUser(name);

        int sum = addNumbers(5, 7);
        System.out.println("Sum from method: " + sum);

        // ===== INPUT / OUTPUT =====
        System.out.println("--- Scanner Input ---");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userNum = sc.nextInt();

        System.out.print("Enter your nickname: ");
        sc.nextLine();  // clear buffer
        String nick = sc.nextLine();

        System.out.println("Hello " + nick + ", your number is " + userNum);

        sc.close();
        mathMethods();
    }
}