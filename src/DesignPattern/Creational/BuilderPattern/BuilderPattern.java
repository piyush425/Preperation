package DesignPattern.Creational.BuilderPattern;


/**
 * The Builder Pattern is useful when you need to create complex objects that have many parts or options.
 * It lets you build the object step by step, making it easy to create different versions of the object without confusing or complicated code.
 */


/**
 * Builder:
 *
 * The basic plan for how to put together a computer.
 *
 *
 *
 *
 *
 *
 *
 *
 * Key Concepts of Builder Pattern:
 * Builder: This interface or abstract class defines all the steps required to create an object. Concrete implementations of the builder interface will build the object step by step.
 * ConcreteBuilder: Implements the steps defined by the builder to create and assemble parts of the product.
 * Product: The final object that is being built.
 * Director: Oversees the construction process and ensures that the steps are executed in order.
 *
 Key Characteristics: Highlight that the Builder Pattern:

 Separates object construction from its representation.
 Allows the construction of complex objects in a step-by-step manner.
 Provides flexibility by allowing different combinations of parts for various representations.
 */
public class BuilderPattern {
    public static void main(String[] args) {

        GamingComputer gamingComputer=new GamingComputer();
        OfficeComputer officeComputer=new OfficeComputer();

        ComputerDirector computerDirector=new ComputerDirector();

        computerDirector.setComputer(gamingComputer);
        Computer computer=computerDirector.buildCoumputer();

        computerDirector.setComputer(officeComputer);
        Computer office=computerDirector.buildCoumputer();

        System.out.println(computer.getCPU());
        System.out.println(office.getCPU());

    }
}
