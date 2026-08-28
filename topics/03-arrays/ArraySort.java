import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 7, 23, 56};

        System.out.println("Before sorting: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("After sorting: " + Arrays.toString(numbers));

        // Manual bubble sort for practice
        int[] manualArray = {30, 10, 40, 20, 50};
        for (int i = 0; i < manualArray.length - 1; i++) {
            for (int j = 0; j < manualArray.length - 1 - i; j++) {
                if (manualArray[j] > manualArray[j + 1]) {
                    int temp = manualArray[j];
                    manualArray[j] = manualArray[j + 1];
                    manualArray[j + 1] = temp;
                }
            }
        }
        System.out.println("Manually bubble sorted: " + Arrays.toString(manualArray));
    }
}