abstract class Payment {
    abstract void pay(double amount);

    void receipt(double amount) {
        System.out.println("Receipt generated for amount: " + amount);
    }
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UpiPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class AbstractDemo {
    public static void main(String args[]) {
        Payment p1 = new CreditCardPayment();
        p1.pay(1500.0);
        p1.receipt(1500.0);

        Payment p2 = new UpiPayment();
        p2.pay(750.0);
        p2.receipt(750.0);
    }
}