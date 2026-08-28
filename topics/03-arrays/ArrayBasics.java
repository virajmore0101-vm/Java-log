public class ArrayBasics {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);
        System.out.println("Array length: " + numbers.length);

        numbers[1] = 25;
        System.out.println("Updated second element: " + numbers[1]);
    }
}