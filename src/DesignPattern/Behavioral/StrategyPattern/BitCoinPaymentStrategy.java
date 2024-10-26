package DesignPattern.Behavioral.StrategyPattern;

public class BitCoinPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("BitCoin card apyment strategy");

    }
}
