package DesignPrinciplesAndPatterns.Facade;

// Subsystem Classes
public class Lights {
    public void dim() {
        System.out.println("Lights dimmed");
    }
    public void on() {
        System.out.println("Lights ON");
    }
}
