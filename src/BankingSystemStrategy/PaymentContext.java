package BankingSystemStrategy;

import BankingSystemStrategy.strategy.byCashStrategy;
import BankingSystemStrategy.strategy.byCreditCardStrategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext() {
        this.paymentStrategy = new byCashStrategy();
    }

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }


    public void paymentDetails() {
        paymentStrategy.paymentDetails();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
