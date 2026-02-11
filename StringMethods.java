public class StringMethods {
    public static void main(String[] args) {

        String str = "Hello Java World";

        System.out.println("Original: " + str);

        System.out.println("Length: " + str.length());

        System.out.println("charAt(1): " + str.charAt(1));

        System.out.println("Substring(0,5): " + str.substring(0,5));

        System.out.println("Contains 'Java': " + str.contains("Java"));

        System.out.println("Equals: " + str.equals("Hello Java World"));
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase("hello java world"));

        System.out.println("CompareTo: " + str.compareTo("Hello"));

        System.out.println("IndexOf 'Java': " + str.indexOf("Java"));
        System.out.println("LastIndexOf 'o': " + str.lastIndexOf("o"));

        System.out.println("To Upper: " + str.toUpperCase());
        System.out.println("To Lower: " + str.toLowerCase());

        String spaced = "   Java   ";
        System.out.println("Trim: '" + spaced.trim() + "'");

        System.out.println("Replace: " + str.replace("Java", "Python"));

        String[] parts = str.split(" ");
        System.out.println("Split:");
        for(String s : parts) System.out.println(s);

        System.out.println("StartsWith 'Hello': " + str.startsWith("Hello"));
        System.out.println("EndsWith 'World': " + str.endsWith("World"));

        String join = String.join("-", "A", "B", "C");
        System.out.println("Join: " + join);

        char[] chars = str.toCharArray();
        System.out.println("toCharArray:");
        for(char c : chars) System.out.print(c + " ");
        System.out.println();

        System.out.println("Is Empty: " + "".isEmpty());

        System.out.println("ValueOf int: " + String.valueOf(100));

        System.out.println("Repeat: " + "Hi ".repeat(3));
    }
}