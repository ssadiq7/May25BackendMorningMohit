package DesignPrinciplesAndPatterns.Singleton;

public class DBConnPoolV3 {

    // This class is a singleton, which means that only one instance of this class can exist.

    private static DBConnPoolV3 instance = null;

    private DBConnPoolV3() {
        // private constructor to prevent instantiation

    }

    static DBConnPoolV3 getInstance() {
        if (instance == null) {
            instance = new DBConnPoolV3();
        }
        return instance;
    }

    // This method ensures that only one instance of the class is created.
    // The first time getInstance() is called, it will create a new instance of DBConnPoolV3.
    // However, subsequent calls to getInstance() will return the same instance,
    // ensuring that only one instance of the class exists throughout the application.
    // However, in multi-threaded environments, this implementation is not thread-safe.
    // To make it thread-safe, we can use synchronized blocks or other concurrency control mechanisms.
    // This is a basic implementation of the singleton pattern.

}