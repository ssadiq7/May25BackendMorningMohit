package DesignPrinciplesAndPatterns.Singleton;

public class DBConnPoolV4 {

    // This class is a singleton, which means that only one instance of this class can exist.
    // To make it thread-safe, let's use synchronized blocks / methods.

    private static DBConnPoolV4 instance = null;

    private DBConnPoolV4() {
        // private constructor to prevent instantiation
    }

    // Synchronized method to ensure that only one thread can access this method at a time.
    // This ensures that only one instance of the class is created, even in a multi-threaded environment.
    synchronized static DBConnPoolV4 getInstance() {
        if (instance == null) {
            instance = new DBConnPoolV4();
        }
        return instance;
    }

    // This method ensures that only one instance of the class is created.
    // The first time getInstance() is called, it will create a new instance of DBConnPoolV4.
    // However, subsequent calls to getInstance() will return the same instance,
    // ensuring that only one instance of the class exists throughout the application.
    // This is a thread-safe implementation of the singleton pattern.
    // However, using synchronized methods can lead to performance issues,
    // as it can cause contention between threads.
    // To improve performance, we can use double-checked locking or other concurrency control mechanisms.
    // This is a basic implementation of the singleton pattern that is thread-safe.

}