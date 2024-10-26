package DesignPattern.Creational.AbstractFactoryPattern;

public class AmericaSause implements Sauce{
    @Override
    public void create() {
        System.out.println("American Sause Created");
    }
}
