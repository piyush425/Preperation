package DesignPattern.Structural.FacadePattern;


/**
 * Facade Design Pattern (Easy Definition):
 * The Facade Pattern provides a simple interface to a complex system. It hides the complexity of multiple classes and provides a single, easy-to-use interface for the client.
 *
 * Easy-to-Remember Definition:
 * "Simplify a complex system by creating a single point of access."
 *
 * Real-World Analogy:
 * Think of a universal remote control for your TV, sound system, and other devices. Instead of using multiple remotes for each device (complex operations), the universal remote (facade) provides a single, simplified interface to control everything.
 *
 * So, the Facade is like a universal remote that makes using complex devices much easier!
 */

// Subsystem classes
class DVDPlayer {
    public void on() { System.out.println("DVD Player is ON."); }
    public void play(String movie) { System.out.println("Playing movie: " + movie); }
}

class Projector {
    public void on() { System.out.println("Projector is ON."); }
    public void setInput(String source) { System.out.println("Projector input set to: " + source); }
}

class SoundSystem {
    public void on() { System.out.println("Sound system is ON."); }
    public void setVolume(int level) { System.out.println("Volume set to: " + level); }
}

class Lights {
    public void dim(int level) { System.out.println("Lights dimmed to: " + level + "%"); }
}

// Facade class
class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, SoundSystem soundSystem, Lights lights) {
        this.dvdPlayer = dvd;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.lights = lights;
    }

    public void startMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(30);
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        lights.dim(100);
        projector.on();
        soundSystem.on();
        dvdPlayer.on();
    }
}

// Client code
public class FacadePatternDemo {
    public static void main(String[] args) {
        // Create subsystem components
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Lights lights = new Lights();

        // Create Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, soundSystem, lights);

        // Use simplified interface to perform complex operations
        homeTheater.startMovie("Inception");
        System.out.println();
        homeTheater.endMovie();
    }
}
