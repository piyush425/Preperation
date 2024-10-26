package DesignPattern.SOLID.DIP;

public class Fan implements device{
    @Override
    public void turnOn() {
        System.out.println("fan is on");
    }
}
