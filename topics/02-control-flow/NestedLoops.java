public class NestedLoops {
    public static void main(String[] args) {
        System.out.println("Multiplication table (1 to 3):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("---");
        }

        System.out.println("Star pattern:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}