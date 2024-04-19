import behavioural.chainOfResponsibility.*;
import behavioural.strategy.CreditCard;
import behavioural.strategy.PaymentCreditCard;
import behavioural.strategy.PaymentService;

public class Main {
    public static void main(String[] args) {

        //ChainOfResponsibility
//        Database database = new Database();
//        Handler handler = new UserExistHandler(database);
//        handler.setNextHandler(new ValidPasswordHandler(database));
//        AuthService authService = new AuthService(handler);
//        authService.logIn("admin","admin");


        //Strategy Design pattern
//        PaymentService paymentService = new PaymentService();
//        paymentService.setStrategy(new PaymentCreditCard());
//        paymentService.setIncludeDelivery(false);
//        paymentService.setCost(200);
//        paymentService.processOrder();
    }
}