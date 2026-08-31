class Vehicle {
    String brand = "Generic Brand";
    void honk() {
        System.out.println("Honking...");
    }
}

class Car extends Vehicle {
    int wheels = 4;
    void showWheels() {
        System.out.println("Wheels: " + wheels);
    }
}

class SportsCar extends Car {
    int topSpeed = 250;
    void showSpeed() {
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }

    public static void main(String args[]) {
        SportsCar s = new SportsCar();
        System.out.println("Brand: " + s.brand);
        s.honk();
        s.showWheels();
        s.showSpeed();
    }
}