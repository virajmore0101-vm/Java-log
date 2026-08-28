public class ArraySearch {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 23, 56};
        int target = 89;
        boolean found = false;
        int foundIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                foundIndex = i;
                break;
            }
        }

        if (found) {
            System.out.println(target + " found at index " + foundIndex);
        } else {
            System.out.println(target + " not found in array");
        }

        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
}