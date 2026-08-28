public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        System.out.println("Using regular for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        System.out.println("Using for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of all elements: " + sum);
    }
}