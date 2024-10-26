package DesignPattern.Creational.Factory;

public class Margherita implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Margherita Pizza is preparing now");
    }
}
