// to run the payment simulation
public class Main {
    public static void main(String[] args) {
        // Create users
        User alice = new User("Alice", "U001");
        User bob = new User("Bob", "U002");

        // Add Credit Card and Cash to Alice
        CreditCard visaCard = new CreditCard("1234-5678-9012", "12/26", "Visa");
        Cash wallet = new Cash("Wallet");

        // Process payments using different methods
        visaCard.processPayment(50.0);   // Output: Paid 50.0 using Credit Card: Visa
        wallet.processPayment(20.0);     // Output: Paid 20.0 using Cash: Wallet
    }
}
