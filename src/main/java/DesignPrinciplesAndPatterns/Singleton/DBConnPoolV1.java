package DesignPrinciplesAndPatterns.Singleton;

public class DBConnPoolV1 {

    private DBConnPoolV1() {
        // private constructor to prevent instantiation

    }

    static DBConnPoolV1 getInstance() {
        return new DBConnPoolV1();
    }

    // Method is static however we will return a new instance of the class every time it is called.
    // This is not a singleton pattern, as it does not ensure that only one instance of the class is created.
    // This is just a factory method that creates a new instance of the class each time it is called.
    // To implement a true singleton pattern, we need to ensure that only one instance of the class is created
    // and that it is accessible globally.
    // DBConnPoolV1.getInstance() will always return a new instance of DBConnPoolV1,
    // which is not the intended behavior of a singleton pattern.

}