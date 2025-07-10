package DesignPrinciplesAndPatterns.Singleton;

public class DBConnPoolV0 {

    private DBConnPoolV0() {
        // private constructor to prevent instantiation

    }

    DBConnPoolV0 db1 = new DBConnPoolV0();
    DBConnPoolV0 db2 = new DBConnPoolV0();

    // Since the constructor is private, we cannot create object outside the class.

}
