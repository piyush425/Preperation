package DesignPattern.Creational.Factory;

public class PizzaFactory {

    public Pizza createPizza(String pizza){
        if(pizza.equals("Margherita")){
             return new Margherita();
        }
        else if(pizza.equals("Panner")){
            return new Paneer();
        }
        return null;
    }
}
