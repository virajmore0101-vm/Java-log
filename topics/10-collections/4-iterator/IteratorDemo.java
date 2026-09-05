import java.util.ArrayList;
import java.util.Iterator;

class IteratorDemo {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        Iterator<Integer> it = numbers.iterator();

        System.out.println("Iterating through list:");
        while (it.hasNext()) {
            int num = it.next();
            System.out.println(num);
            if (num == 20) {
                it.remove();
            }
        }

        System.out.println("List after removing 20: " + numbers);
    }
}