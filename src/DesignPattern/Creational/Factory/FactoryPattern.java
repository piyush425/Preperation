package DesignPattern.Creational.Factory;


/**
 * The Factory pattern is like a machine that makes objects for you.
 * You tell the machine what type of object you need, and it creates it for you without you needing to know how.
 *
 * e.g Think of a pizza shop where you order a pizza. Instead of making the pizza yourself,
 *     you tell the shop what type of pizza you want (like Margherita or Paneer),
 *     and the shop makes it for you. You don’t need to know how they make each type—just what you want.
 */


public class FactoryPattern {

    public static void main(String[] args) {

        PizzaFactory pizzaFactory=new PizzaFactory();

        Pizza pizza1=pizzaFactory.createPizza("Margherita");
        pizza1.prepare();

        Pizza pizza2=pizzaFactory.createPizza("Panner");
        pizza2.prepare();


    }
}
