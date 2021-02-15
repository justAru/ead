package BankingSystemStrategy.strategy;

import BankingSystemStrategy.PaymentStrategy;

public class byCashStrategy implements PaymentStrategy {

    @Override
    public void paymentDetails() {
        System.out.println("Please, open 2GIS app and follow to a nearest point...");
    }
}
