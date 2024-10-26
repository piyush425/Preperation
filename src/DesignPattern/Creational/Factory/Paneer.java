package DesignPattern.Creational.Factory;

public class Paneer implements Pizza{
    @Override
    public  void prepare() {
        System.out.println("paneer pizza preparing");
    }
}
