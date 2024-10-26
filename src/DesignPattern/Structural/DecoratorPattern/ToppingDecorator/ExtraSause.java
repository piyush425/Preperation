package DesignPattern.Structural.DecoratorPattern.ToppingDecorator;

import DesignPattern.Structural.DecoratorPattern.Base.BasePizza;

public class ExtraSause extends ToppingPizza{

    BasePizza basePizza;

    public ExtraSause(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public double cost() {
        return basePizza.cost()+12;
    }
}
