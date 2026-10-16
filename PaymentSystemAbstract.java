// Abstract class
abstract class Payment {
    double amount;

    // Constructor
    Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method (must be implemented by subclasses)
    abstract void processPayment();

    // Concrete method (shared by all subclasses)
    void printReceipt() {
        System.out.println("Payment of " + amount + " processed successfully.");
    }
}

// Implementation: Credit Card Payment
class CreditCardPayment extends Payment {
    CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Processing Credit Card Payment...");
    }
}

// Implementation: PayPal Payment
class PayPalPayment extends Payment {
    PayPalPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Processing PayPal Payment...");
    }
}

// Implementation: UPI Payment
class UpiPayment extends Payment {
    UpiPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Processing UPI Payment...");
    }
}

// Main class to test the abstract class
public class PaymentSystemAbstract {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment(1000.0);
        creditCard.processPayment();
        creditCard.printReceipt();

        System.out.println("-------------------");

        Payment paypal = new PayPalPayment(500.0);
        paypal.processPayment();
        paypal.printReceipt();

        System.out.println("-------------------");

        Payment upi = new UpiPayment(250.0);
        upi.processPayment();
        upi.printReceipt();
    }
}
