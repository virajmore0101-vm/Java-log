class StaticMembers {
    static int studentCount = 0;
    String studentName;

    StaticMembers(String name) {
        studentName = name;
        studentCount++;
        System.out.println(studentName + " joined the class.");
    }

    static void showTotalStudents() {
        System.out.println("Total students in class: " + studentCount);
    }

    public static void main(String args[]) {
        StaticMembers s1 = new StaticMembers("Rohan");
        StaticMembers s2 = new StaticMembers("Meera");
        StaticMembers s3 = new StaticMembers("Kabir");

        StaticMembers.showTotalStudents();
    }
}