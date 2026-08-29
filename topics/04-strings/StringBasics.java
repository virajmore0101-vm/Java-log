public class StringBasics {
    public static void main(String[] args) {
        String name = "John";
        String greeting = "Hello, " + name + "!";

        System.out.println(greeting);
        System.out.println("Length of name: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
    }
}