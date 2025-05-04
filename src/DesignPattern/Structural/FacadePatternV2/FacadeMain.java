package DesignPattern.Structural.FacadePatternV2;

/**
 * The Facade Design Pattern is a structural pattern that provides a simplified
 * interface to a larger and more complex system.
 * It hides the complexities of subsystems and provides a unified interface to the client.
 *
 * Real-Life Analogy 🏢
 * Imagine a hotel reception:
 *
 * Instead of dealing with multiple departments (room booking, food service, housekeeping), you just talk to the receptionist (Facade).
 * The receptionist communicates with the right departments internally.
 *
 * When to Use?
 * ✔ When you have a complex system with many interdependent classes.
 * ✔ When you want to provide a simplified interface to clients.
 * ✔ When you want to decouple clients from the underlying system.
 */

public class FacadeMain {

    public static void main(String[] args) {

        HotelFacade hotel = new HotelFacade();
        hotel.bookHotelRoom();
    }
}
