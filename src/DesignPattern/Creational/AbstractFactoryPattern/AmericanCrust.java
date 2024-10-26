package DesignPattern.Creational.AbstractFactoryPattern;

public class AmericanCrust implements Crust{
    @Override
    public void create() {
        System.out.println("American Crust Created");
    }
}
