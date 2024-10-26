package DesignPattern.Behavioral.StrategyPattern;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("credit card apyment strategy");
    }
}
