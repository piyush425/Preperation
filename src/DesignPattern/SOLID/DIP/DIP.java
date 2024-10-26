package DesignPattern.SOLID.DIP;

/**
 * Class should be dependent on interface rather than concrete classs
 */

/**
 * The Dependency Inversion Principle means that high-level modules should not depend on low-level modules.
 * Instead, both should depend on abstractions, like interfaces,
 * to reduce tight coupling and make the system more flexible and maintainable.
 */
public class DIP {

    public static void main(String[] args) {

        Fan fan=new Fan();

        ElectricDevice electricDevice=new ElectricDevice(fan);

        electricDevice.switchOn();

    }




}
