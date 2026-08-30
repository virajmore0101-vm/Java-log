class InstanceMembers {
    String studentName;
    int marks;

    InstanceMembers(String name, int m) {
        studentName = name;
        marks = m;
    }

    void showDetails() {
        System.out.println(studentName + " scored " + marks + " marks.");
    }

    public static void main(String args[]) {
        InstanceMembers s1 = new InstanceMembers("Rohan", 85);
        InstanceMembers s2 = new InstanceMembers("Meera", 92);

        s1.showDetails();
        s2.showDetails();

        // Changing s1's marks does NOT affect s2 - each object has its own copy
        s1.marks = 90;
        System.out.println("After update:");
        s1.showDetails();
        s2.showDetails();
    }
}