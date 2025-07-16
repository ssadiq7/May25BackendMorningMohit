package DesignPrinciplesAndPatterns.Facade;

public class Client {
    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, lights);

        homeTheater.watchMovie("Inception");
        System.out.println("-----");
        homeTheater.endMovie();
    }
}

// The client interacts only with HomeTheaterFacade, not the subsystem classes directly.
// The facade simplifies using the complex subsystem.