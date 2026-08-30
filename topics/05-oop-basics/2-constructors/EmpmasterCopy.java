class EmpmasterCopy {
    private String ename, dept, post;
    private int pday;
    private float perday;

    EmpmasterCopy() {
        ename = "Raj";
        dept = "Finance";
        post = "Analyst";
        pday = 26;
        perday = 1800;
    }

    EmpmasterCopy(String n, String d, String p, int pd, float per) {
        ename = n;
        dept = d;
        post = p;
        pday = pd;
        perday = per;
    }

    EmpmasterCopy(EmpmasterCopy e) {
        ename = e.ename;
        dept = e.dept;
        post = e.post;
        pday = e.pday;
        perday = e.perday;
    }

    void display() {
        System.out.println("Name: " + ename);
        System.out.println("Department: " + dept);
        System.out.println("Post: " + post);
        System.out.println("Present Days: " + pday);
        System.out.println("Per Day Wages: " + perday);
    }

    public static void main(String args[]) {
        EmpmasterCopy e1 = new EmpmasterCopy();
        EmpmasterCopy e2 = new EmpmasterCopy(e1);
        System.out.println("Original Object:");
        e1.display();
        System.out.println("\nCopied Object:");
        e2.display();
    }
}