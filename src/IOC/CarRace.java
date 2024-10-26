package IOC;

/**
 *
 *
 * Inversion of Control (IoC) is a design principle that transfers the control of object creation and dependency management from the application itself to the Spring framework.
 * Instead of the application creating its dependencies, Spring handles that responsibility, making the system more modular, testable, and easier to maintain
 *
 *
 *In Spring, IoC is primarily implemented through Dependency Injection (DI). Spring automatically injects dependencies (like services, repositories, etc.) into classes that need them.
 *
 *
 * Dependency Injection (DI) is a technique where an object’s dependencies (the services or components it needs to function) are provided by an external source,
 * rather than the object creating or finding them itself. This helps in making code more modular, flexible, and easier to test.
 *
 *
 */

public class CarRace {
    public static void main(String[] args) {

        Maruti maruti=new Maruti();

        Race race=new Race(maruti);

        race.run();
    }
}
