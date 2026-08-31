class Animal {
    String name = "Animal";
    void sound() {
        System.out.println(name + " makes a sound");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        name = "Dog";
    }
    @Override
    void sound() {
        super.sound();
        System.out.println(name + " barks");
    }

    public static void main(String args[]) {
        Dog d = new Dog();
        d.sound();
    }
}