public class StringMethods {
    public static void main(String[] args) {
        String text = "  Java Programming  ";

        System.out.println("Original: '" + text + "'");
        System.out.println("Trimmed: '" + text.trim() + "'");
        System.out.println("Contains 'Program': " + text.contains("Program"));
        System.out.println("Replace 'Java' with 'Python': " + text.replace("Java", "Python"));
        System.out.println("Substring (2 to 6): " + text.trim().substring(2, 6));
        System.out.println("Char at index 0: " + text.trim().charAt(0));
    }
}