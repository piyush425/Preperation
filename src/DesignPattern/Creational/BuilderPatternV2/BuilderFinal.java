package DesignPattern.Creational.BuilderPatternV2;

/**
 * The Builder Design Pattern is a creational design pattern used to construct complex objects step by step.
 * It allows you to create different variations of an object without changing its structure.
 *
 * Why use the Builder Pattern?
 * When an object has many optional parameters, using a constructor with too many arguments can be confusing.
 * It improves readability by allowing method chaining.
 * It helps in making objects immutable.
 *
 *
 * Advantages of the Builder Pattern
 * ✅ Readability – No need for long constructors with many parameters.
 * ✅ Immutability – The object is created in a single step, reducing bugs.
 * ✅ Scalability – Easily extendable if new parameters are needed.
 *
 * This pattern is widely used in frameworks like Spring and Lombok (@Builder). 🚀
 */

public class BuilderFinal {
    public static void main(String[] args) {

        Car car=new Carbuilder("Enhine1","Alloy").setAirBag(true).build();

        Car car2=new Carbuilder("Engine2","Z tyre").build();
        System.out.println(car2);

        System.out.println(car);

    }
}
