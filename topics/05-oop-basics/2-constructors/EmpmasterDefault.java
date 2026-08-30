import java.util.*;

class EmpmasterDefault {
    String ename, dept, post;
    int pday;
    float perday;

    EmpmasterDefault() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        ename = sc.nextLine();
        System.out.print("Enter Department: ");
        dept = sc.nextLine();
        System.out.print("Enter Post: ");
        post = sc.nextLine();
        System.out.print("Enter Present Days: ");
        pday = sc.nextInt();
        System.out.print("Enter Per Day Wages: ");
        perday = sc.nextFloat();
    }

    void display() {
        System.out.println("Name: " + ename);
        System.out.println("Department: " + dept);
        System.out.println("Post: " + post);
        System.out.println("Present Days: " + pday);
        System.out.println("Per Day Wages: " + perday);
    }

    public static void main(String args[]) {
        EmpmasterDefault e = new EmpmasterDefault();
        e.display();
    }
}