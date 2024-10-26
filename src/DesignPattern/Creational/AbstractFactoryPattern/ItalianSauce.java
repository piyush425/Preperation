package DesignPattern.Creational.AbstractFactoryPattern;

public class ItalianSauce implements Sauce{
    @Override
    public void create() {
        System.out.println("Italian Sauce Created");
    }
}
