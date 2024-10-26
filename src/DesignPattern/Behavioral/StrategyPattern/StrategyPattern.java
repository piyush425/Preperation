package DesignPattern.Behavioral.StrategyPattern;

/**
 * The Strategy Pattern enables a class to change its behavior by switching between different algorithms or strategies without modifying the class itself.
 */

public class StrategyPattern {
    public static void main(String[] args) {

        BitCoinPaymentStrategy bitCoinPaymentStrategy=new BitCoinPaymentStrategy();

        Payment payment=new Payment(bitCoinPaymentStrategy);

        payment.pay();

    }
}
