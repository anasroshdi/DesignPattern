package behavioural.strategy;

import lombok.Data;

@Data
public class CreditCard{

    private int amount = 1_000;
    private final String number;
    private final String data;
    private final String cvv;

}
