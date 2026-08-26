public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Counting 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("Sum of 1 to 10:");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Total: " + sum);
    }
}