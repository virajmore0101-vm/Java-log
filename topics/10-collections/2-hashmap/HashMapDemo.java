import java.util.HashMap;

class HashMapDemo {
    public static void main(String args[]) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Raj", 85);
        marks.put("Meera", 92);
        marks.put("Kabir", 78);

        System.out.println("All marks: " + marks);
        System.out.println("Meera's marks: " + marks.get("Meera"));

        marks.put("Raj", 90);
        System.out.println("After updating Raj: " + marks);

        System.out.println("Contains key Kabir? " + marks.containsKey("Kabir"));

        for (String name : marks.keySet()) {
            System.out.println(name + " -> " + marks.get(name));
        }
    }
}