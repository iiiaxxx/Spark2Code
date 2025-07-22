// Class representing a credit card payment method
public class CreditCard extends PaymentMethod {
    private String cardNumber;
    private String expiryDate;

    // Constructor takes card details and label
    public CreditCard(String cardNumber, String expiryDate, String label) {
        super("Credit Card", label); // methodName, label
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }
    // Implementation of the payment processing
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Paid " + amount + " using " + methodName + ": " + label);
        return true; // Assume payment is always successful
    }
}
