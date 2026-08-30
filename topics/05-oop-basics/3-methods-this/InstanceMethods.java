class InstanceMethods {
    String name;
    int age;

    void setDetails(String n, int a) {
        name = n;
        age = a;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void haveBirthday() {
        age = age + 1;
        System.out.println(name + " turned " + age + "!");
    }

    public static void main(String args[]) {
        InstanceMethods person = new InstanceMethods();
        person.setDetails("Raj", 21);
        person.showDetails();
        person.haveBirthday();
    }
}