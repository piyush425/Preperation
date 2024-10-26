package DesignPattern.Creational.AbstractFactoryPattern;

public class ItalianPizzaFactory implements PizzaAbstractFactory {
    @Override
    public Crust createCrust() {
        return new ItalianCrust();
    }

    @Override
    public Sauce createSause() {
        return new ItalianSauce();
    }
}
