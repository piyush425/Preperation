package DesignPattern.Behavioral.StrategyPattern;

public class Payment {

    private PaymentStrategy paymentStrategy;


    public Payment(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void pay(){
        this.paymentStrategy.pay();
    }
}
