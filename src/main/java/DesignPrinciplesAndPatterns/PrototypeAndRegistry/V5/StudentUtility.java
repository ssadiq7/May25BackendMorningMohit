package DesignPrinciplesAndPatterns.PrototypeAndRegistry.V4;

public class StudentUtility {
    public static void createCopy(Student student) {
        Student st1 = student.copy();
        System.out.println(st1.getName());

        // Over here we do not know the type of the student object
        // but we can still call the copy method
    }
    // Now let's see the usage of Registry
    // Student
    // DataScience
    // Academy
    // Devops

    // Length of the program
    // Cost of the program
}
