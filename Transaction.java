import java.time.LocalDateTime;

public class Transaction {
    private User sender;
    private User receiver;
    private double amount;
    private PaymentMethod method;
    private LocalDateTime date;

    public Transaction(User sender, User receiver, double amount, PaymentMethod method) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.method = method;
        this.date = LocalDateTime.now();
    }

    public void printReceipt() {
        System.out.println("----- Receipt -----");
        System.out.println("From: " + sender.getName());
        System.out.println("To: " + receiver.getName());
        System.out.println("Amount: $" + amount);
        System.out.println("Method: " + method.getMethodName());
        System.out.println("Date: " + date);
        System.out.println("-------------------");
    }
}
