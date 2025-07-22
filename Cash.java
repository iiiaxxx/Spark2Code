// Class representing a cash payment method
public class Cash extends PaymentMethod {

    // Constructor only requires a label
    public Cash(String label) {
        super("Cash", label);
    }
    // Implementation of the payment processing
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Paid " + amount + " using " + methodName + ": " + label);
        return true;
    }
}
