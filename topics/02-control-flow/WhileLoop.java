public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;
        System.out.println("While loop counting to 5:");
        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        System.out.println("Do-while loop example:");
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 3);
    }
}