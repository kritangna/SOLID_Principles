public class PayPalPayment extends PaymentProcessor{

    private String paymentType;

    public PayPalPayment()
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
    public void processPayment(PaymentProcessor processor, double amount, String name)
    {
        System.out.println("Processing " + name + " payment of amount: $" + amount);
    }
}
