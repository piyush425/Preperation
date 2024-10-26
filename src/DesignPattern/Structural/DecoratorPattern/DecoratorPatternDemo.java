package DesignPattern.Structural.DecoratorPattern;

import DesignPattern.Structural.DecoratorPattern.Base.BasePizza;
import DesignPattern.Structural.DecoratorPattern.Base.Maghreta;
import DesignPattern.Structural.DecoratorPattern.ToppingDecorator.ExtraCheese;


/**
 * The Decorator Design Pattern lets you add new features to an object without changing its structure.
 *
 * It wraps the original object and provides additional functionality, allowing you to "decorate" it with new behaviors.
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        BasePizza basePizza=new ExtraCheese(new Maghreta());

        System.out.println(basePizza.cost());

           }
}
