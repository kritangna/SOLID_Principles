public class CreditCardPayment extends PaymentProcessor{

    private String paymentType;

    public CreditCardPayment()
    {

    }

    public String getPaymentType()
    {
        return paymentType;
    }

    public void setPaymentType(String type)
    {
        paymentType = type;
    }

    @Override
    public void processPayment(PaymentProcessor processor, double amount, String name) {
        System.out.println("Processing " + name + " Payment of amount: $" + amount);
    }
}
