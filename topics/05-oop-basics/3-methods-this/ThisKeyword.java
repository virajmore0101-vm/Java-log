class ThisKeyword {
    String name;
    int age;

    ThisKeyword(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String args[]) {
        ThisKeyword person = new ThisKeyword("Raj", 22);
        person.showDetails();
    }
}