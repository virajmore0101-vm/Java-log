public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";

        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3));
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));
    }
}