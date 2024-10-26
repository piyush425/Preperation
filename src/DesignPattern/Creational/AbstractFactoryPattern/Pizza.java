package DesignPattern.Creational.AbstractFactoryPattern;

public class Pizza {

    Crust crust;
    Sauce sauce;

    Pizza(PizzaAbstractFactory factory){
        this.crust=factory.createCrust();
        this.sauce=factory.createSause();
    }

    public void prepare(){
        this.crust.create();
        this.sauce.create();
        System.out.println("pizza is ready");
    }
}
