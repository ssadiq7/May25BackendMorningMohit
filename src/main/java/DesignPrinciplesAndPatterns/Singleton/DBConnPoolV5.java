package DesignPrinciplesAndPatterns.Singleton;

public class DBConnPoolV5 {

    // This class is a singleton, which means that only one instance of this class can exist.

    // To make it thread-safe, we will use the "Eager Initialization" method.
    private static DBConnPoolV5 instance = new DBConnPoolV5(); // instance is created at the time of class loading

    private DBConnPoolV5() {
        // private constructor to prevent instantiation
    }

    static DBConnPoolV5 getInstance() {
        return instance;
    }

    // This method ensures that only one instance of the class is created,
    // and it is accessible globally through the getInstance() method.
    // The instance is created at the time of class loading, which is thread-safe.

    // This approach is known as the "Eager Initialization" method.

    // It is a simple and straightforward way to implement the singleton pattern.
    // It is simple and effective, but it may not be suitable for all scenarios,
    // especially if the instance creation is resource-intensive and not always needed.
    // In such cases, "Lazy Initialization" or "Double-Checked Locking" methods may be more appropriate.
    // This method increases the application start time since the instance is created at the time of class loading,
    // but it ensures that the instance is always available when needed.
    // If we don't want the object, then the instance will become useless.
    // Custom configuration can be added to the constructor to initialize the instance with specific parameters,
    // but it will still be created at the time of class loading.
    // We cannot create custom configuration since the instance is created at the time of class loading.
    // What if we want custom configuration?
    // In that case, we can use a static factory method that accepts parameters and initializes the instance accordingly.
    // However, this will not be a true singleton pattern, as it allows multiple instances to be created with different configurations.
    // To ensure that only one instance of the class is created, we can use a static block to initialize the instance.

}