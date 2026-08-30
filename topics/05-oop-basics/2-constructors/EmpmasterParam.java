class EmpmasterParam {
    String ename, dept, post;
    int pday;
    float perday;

    EmpmasterParam(String n, String d, String p, int pd, float pw) {
        ename = n;
        dept = d;
        post = p;
        pday = pd;
        perday = pw;
    }

    void display() {
        System.out.println("Name: " + ename);
        System.out.println("Department: " + dept);
        System.out.println("Post: " + post);
        System.out.println("Present Days: " + pday);
        System.out.println("Per Day Wages: " + perday);
    }

    public static void main(String args[]) {
        EmpmasterParam e = new EmpmasterParam("Vijay", "IT", "Manager", 28, 1500);
        e.display();
    }
}