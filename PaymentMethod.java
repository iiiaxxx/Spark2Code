// Abstract class representing a general payment method
public abstract class PaymentMethod {
    protected String methodName; // Type of method
    protected String label;

    // Constructor to initialize payment method detail
    public PaymentMethod(String methodName, String label) {
        this.methodName = methodName;
        this.label = label;
    }
    // Getter for method name
    public String getMethodName() {
        return methodName;
    }
    // Getter for label
    public String getLabel() {
        return label;
    }
    // Abstract method to be implemented by all subclasses
    public abstract boolean processPayment(double amount);
}