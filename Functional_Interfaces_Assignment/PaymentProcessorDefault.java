
interface PaymentProcessor {
    void processPayment();
    default void refund() {
        System.out.println("Refund processed (default).");
    }
}

class PayPal implements PaymentProcessor {
    public void processPayment() {
        System.out.println("Payment done using PayPal");
    }
}

public class PaymentProcessorDefault {
    public static void main(String[] args) {
        PaymentProcessor p = new PayPal();
        p.processPayment();
        p.refund();
    }
}
