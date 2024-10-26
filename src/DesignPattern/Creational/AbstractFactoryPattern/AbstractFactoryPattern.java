package DesignPattern.Creational.AbstractFactoryPattern;

/**
 * The Abstract Factory pattern is a design pattern that provides an interface
 * to create families of related objects without specifying their exact classes.
 * It helps ensure that related objects are used together consistently.
 */


/**
 * Abstract Factory: You have a PizzaAbstractFactory that provides an interface for creating different parts of a pizza.
 * Concrete Factories: You have ItalianPizzaFactory and AmericanPizzaFactory. Each factory knows how to create the right crust, sauce, and toppings for its specific style.
 * Result: When you order an Italian pizza, you get the correct Italian crust, sauce, and toppings. If you order an American pizza, you get the American version of each part.
 *
 */
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        AmericaPizzaFactory americaPizzaFactory=new AmericaPizzaFactory();
        Pizza pizza1=new Pizza(americaPizzaFactory);

        ItalianPizzaFactory italianPizzaFactory=new ItalianPizzaFactory();
        Pizza pizza2=new Pizza(italianPizzaFactory);

        pizza1.prepare();
        pizza2.prepare();

    }
}
