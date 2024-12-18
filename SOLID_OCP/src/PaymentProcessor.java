public abstract class PaymentProcessor {

    public PaymentProcessor()
    {

    }

    public abstract void processPayment(PaymentProcessor processor, double amount, String name);
}
