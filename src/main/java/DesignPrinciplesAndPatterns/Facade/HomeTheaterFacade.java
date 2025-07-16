package DesignPrinciplesAndPatterns.Facade;

// Facade Class
public class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, Lights lights) {
        this.dvd = dvd;
        this.projector = projector;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim();
        projector.on();
        projector.setWideScreenMode();
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        dvd.off();
        projector.off();
        lights.on();
    }
}


// The Facade pattern provides a simplified, unified interface to a complex subsystem.
// It hides the complexities of the system and provides an easy-to-use interface for the client.