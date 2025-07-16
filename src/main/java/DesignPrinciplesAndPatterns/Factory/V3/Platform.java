package DesignPrinciplesAndPatterns.Factory.V3;

public abstract class Platform {
    public void setRefreshRate() {
        System.out.println("Setting refresh rate for the platform.");
    }

//    public abstract Button createButton();

    // Now, if we add another abstract method to create dropdown, the Platform class will lose its identity as a factory.
    // Since single responsibility principle is violated, we should create a new class that extends Platform to handle dropdown creation.
//    public abstract Dropdown createDropdown(); // We will take away this responsibility from you, but please help me in creating the corresponding factories.
    // NO NO NO! Hold on PLEASE!
    // I am not going to do this, this is not my responsibility.
    // I have my old family to take care of (which is line number 7.
    // I am a platform class, I am not responsible for creating different objects for you.
    // Instead, I will create a new class that extends Platform to handle dropdown creation.

    //    public abstract Dropdown createDropdown(); // We will take away this responsibility from you, but please help me in creating the corresponding factories.
//    public abstract Dropdown createDropdown(); // We will take away this responsibility from you, but please help me in creating the corresponding factories.
    // Or else I will have to come back to the Client
    // Then based on the platform, I will have to create the factory first and implement if-else and create simple factory
//    public abstract Dropdown createDropdown(); // We will take away this responsibility from you, but please help me in creating the corresponding factories.
    public abstract UIComponentFactory createUIComponentFactory();
}
