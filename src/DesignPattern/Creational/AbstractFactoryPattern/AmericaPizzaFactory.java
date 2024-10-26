package DesignPattern.Creational.AbstractFactoryPattern;

public class AmericaPizzaFactory implements PizzaAbstractFactory{
    @Override
    public Crust createCrust() {
        return new AmericanCrust();
    }

    @Override
    public Sauce createSause() {
        return new AmericaSause();
    }
}
