import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits list: " + fruits);
        System.out.println("First fruit: " + fruits.get(0));

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        System.out.println("Size: " + fruits.size());
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
    }
}