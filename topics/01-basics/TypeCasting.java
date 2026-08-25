public class TypeCasting {
    public static void main(String[] args) {
        // Widening (automatic)
        int myInt = 9;
        double myDouble = myInt;
        System.out.println("Widening: int to double -> " + myDouble);

        // Narrowing (manual)
        double anotherDouble = 9.78;
        int anotherInt = (int) anotherDouble;
        System.out.println("Narrowing: double to int -> " + anotherInt);
    }
}