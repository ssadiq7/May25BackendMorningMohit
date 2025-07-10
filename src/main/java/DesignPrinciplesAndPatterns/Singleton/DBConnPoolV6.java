package DesignPrinciplesAndPatterns.Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnPoolV6 {

    // This class is a singleton, which means that only one instance of this class can exist.
    // Implementation using lock and unlock mechanism.
    private static final Lock lock = new ReentrantLock();

    private static DBConnPoolV6 instance = null;

    private DBConnPoolV6() {
        // private constructor to prevent instantiation
    }

//    static DBConnPoolV6 getInstance() {
//
//        // Let's lock and then check if instance is null.
//        lock.lock();
//        if (instance == null) {
//            instance = new DBConnPoolV6();
//        }
//        lock.unlock();
//
//        return instance;
//    }
    // This method provides no optimization for performance,
    // as it locks the entire method, which can lead to contention between threads.

//    static DBConnPoolV6 getInstance() {
//        // What if we put the lock inside the crucial part?
//        if(instance == null) {
//            lock.lock();
//            instance = new DBConnPoolV6();
//            lock.unlock();
//        }
//
//        return instance;
//    }
    // This method ensures that only one instance of the class is created.
    // The first time getInstance() is called, it will create a new instance of DBConnPoolV6.
    // However, subsequent calls to getInstance() will return the same instance,
    // ensuring that only one instance of the class exists throughout the application.
    // This is a thread-safe implementation of the singleton pattern using lock and unlock mechanism.
    // However, using locks can lead to performance issues,
    // as it can cause contention between threads.
    // To improve performance, we can use double-checked locking or other concurrency control mechanisms.

    // Double-checked locking is a design pattern that reduces the overhead of acquiring a lock by first checking the locking criterion without actually acquiring the lock.
    static DBConnPoolV6 getInstance() {
        if (instance == null) {
            lock.lock();
            try {
                if (instance == null) {
                    instance = new DBConnPoolV6();
                }
            } finally {
                lock.unlock();
            }
        }
        return instance;
    }
    // This is the most efficient way to implement a singleton pattern in a multi-threaded environment.
    // It ensures that only one instance of the class is created,
    // and it minimizes the performance overhead of acquiring a lock by only locking when necessary.
    // This method ensures that only one instance of the class is created,
    // and it is accessible globally through the getInstance() method.
    // The instance is created only when it is needed, which is known as "Lazy Initialization".
    // This approach is thread-safe and efficient, as it minimizes the performance overhead of acquiring a lock.
    // This method is suitable for scenarios where the instance creation is resource-intensive and not always needed.
    // Custom configuration can be added to the constructor to initialize the instance with specific parameters,
    // but it will still be created only when it is needed.

    // Even if more than one thread tries to access the getInstance() method at the same time,
    // only one thread will be able to create the instance, ensuring that only one instance of the class exists.

    // This implementation is a true singleton pattern, as it ensures that only one instance of the class is created
    // and that it is accessible globally through the getInstance() method.

}