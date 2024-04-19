package behavioural.strategy;

public class PaymentPaypal implements PaymentStrategy {

    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        email = "ssss@gmail.com";
        password = "*******";
    }

    @Override
    public boolean validatePaymentDetails() {
        return false;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying "+ amount + " using paypal");
    }
}
