interface Vehicle {
    void start();
    void stop();
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started with a kick");
    }
    public void stop() {
        System.out.println("Bike stopped");
    }
}

class ElectricCar implements Vehicle {
    public void start() {
        System.out.println("Electric Car started silently");
    }
    public void stop() {
        System.out.println("Electric Car stopped");
    }
}

class InterfaceDemo {
    public static void main(String args[]) {
        Vehicle v1 = new Bike();
        v1.start();
        v1.stop();

        Vehicle v2 = new ElectricCar();
        v2.start();
        v2.stop();
    }
}