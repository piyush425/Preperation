package DesignPattern.Creational.AbstractFactoryPattern;

public class ItalianCrust implements Crust{
    @Override
    public void create() {
        System.out.println("Intalian Crust Created");
    }
}
