import java.util.ArrayList;
import java.util.List;

public class User {
    // Class representing a user/customer
    private String name;
    private String id;
    private List<PaymentMethod> paymentMethods;
    // Constructor to initialize user with name and ID
    public User(String name, String id) {
        this.name = name;
        this.id = id;
        this.paymentMethods = new ArrayList<>();
    }
    // Getter for user's name
    public String getName() {
        return name;
    }
    // Add a new payment method to the user
    public void addPaymentMethod(PaymentMethod method) {
        paymentMethods.add(method);
    }
    // Get all user's payment methods
    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }
}
