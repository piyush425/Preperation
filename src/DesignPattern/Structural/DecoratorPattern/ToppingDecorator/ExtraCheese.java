package DesignPattern.Structural.DecoratorPattern.ToppingDecorator;

import DesignPattern.Structural.DecoratorPattern.Base.BasePizza;

public class ExtraCheese extends ToppingPizza{

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public double cost() {
        return basePizza.cost()+15;
    }
}
