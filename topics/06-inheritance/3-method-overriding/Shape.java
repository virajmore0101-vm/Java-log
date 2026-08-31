class Shape {
    void area() {
        System.out.println("Area calculation not defined for generic shape.");
    }
}

class Circle extends Shape {
    double radius = 5.0;
    @Override
    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Circle Area: " + result);
    }
}

class Square extends Shape {
    double side = 4.0;
    @Override
    void area() {
        double result = side * side;
        System.out.println("Square Area: " + result);
    }

    public static void main(String args[]) {
        Shape s1 = new Circle();
        Shape s2 = new Square();
        s1.area();
        s2.area();
    }
}