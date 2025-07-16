package DesignPrinciplesAndPatterns.Facade;

// Subsystem Classes
public class Projector {
    public void on() {
        System.out.println("Projector ON");
    }
    public void setWideScreenMode() {
        System.out.println("Projector in wide screen mode");
    }
    public void off() {
        System.out.println("Projector OFF");
    }
}
