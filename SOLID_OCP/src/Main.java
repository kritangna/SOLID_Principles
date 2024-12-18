public class Main {
    public static void main(String[] args) {

        CreditCardPayment creditCard = new CreditCardPayment();
        PayPalPayment paypal = new PayPalPayment();

        creditCard.setPaymentType("Credit Card");
        paypal.setPaymentType("PayPal");

        creditCard.processPayment(creditCard, 1547, creditCard.getPaymentType());
        paypal.processPayment(paypal, 2563, paypal.getPaymentType());

    }
}
