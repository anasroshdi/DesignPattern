package behavioural.strategy;

public class PaymentCreditCard implements PaymentStrategy {

    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        card = new CreditCard("cardnumber","expiryDate","cvv");
    }

    @Override
    public boolean validatePaymentDetails() {
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " Using Credit Card");
        card.setAmount(card.getAmount()-amount);

    }
}
