import java.util.Scanner;

class emp {
    private String empname, post, dept, empid;

    public void readEmp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        empname = sc.nextLine();

        System.out.println("Enter Employee Post: ");
        post = sc.nextLine();

        System.out.println("Enter Employee Department: ");
        dept = sc.nextLine();

        System.out.println("Enter Employee Id: ");
        empid = sc.nextLine();
    }

    public void display() {
        System.out.println("Employee name       : " + empname);
        System.out.println("Employee Post       : " + post);
        System.out.println("Employee Department : " + dept);
        System.out.println("Employee Id         : " + empid);
    }
}

class salary extends emp {
    private int pday;
    private float perday, basic, hra, da, ta, deduction, netsalary;

    void readEmpSlr() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total Present Days: ");
        pday = sc.nextInt();

        System.out.println("Enter Per Day Wages: ");
        perday = sc.nextFloat();

        basic = perday * pday;
        hra = basic * 15.0f / 100.0f;
        da = basic * 12.0f / 100.0f;
        ta = basic * 10.0f / 100.0f;
        deduction = basic * 7.0f / 100.0f;

        netsalary = basic + hra + da + ta - deduction;
    }

    void displaySalary() {
        System.out.println("Basic Salary : " + basic);
        System.out.println("HRA          : " + hra);
        System.out.println("DA           : " + da);
        System.out.println("TA           : " + ta);
        System.out.println("Deduction    : " + deduction);
        System.out.println("Net Salary   : " + netsalary);
    }

    public static void main(String args[]) {
        salary s = new salary();
        s.readEmp();
        s.readEmpSlr();
        System.out.println("\n--- Employee Details ---");
        s.display();
        System.out.println("\n--- Salary Details ---");
        s.displaySalary();
    }
}