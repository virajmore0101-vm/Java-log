import java.util.HashSet;

class HashSetDemo {
    public static void main(String args[]) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Mumbai");

        System.out.println("Cities (duplicates auto-removed): " + cities);
        System.out.println("Contains Delhi? " + cities.contains("Delhi"));

        cities.remove("Pune");
        System.out.println("After removing Pune: " + cities);

        System.out.println("Size: " + cities.size());
    }
}