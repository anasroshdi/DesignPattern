import behavioural.chainOfResponsibility.*;

public class Main {
    public static void main(String[] args) {

        //ChainOfResponsibility
        Database database = new Database();
        Handler handler = new UserExistHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database));
        AuthService authService = new AuthService(handler);
        authService.logIn("admin","admin");

    }
}