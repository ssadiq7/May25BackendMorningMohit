package DesignPrinciplesAndPatterns.PrototypeAndRegistry.V4;

public class Client {
    public static void main(String[] args) {
        Student st = new Student(1, "John Doe", 3.8, 2024);
        IntelligentStudent is = new IntelligentStudent(2, "Intelligent John", 3.8, 2024, 130);

        // Create the copy of both the objects
        Student stCopy = new Student(st);
        IntelligentStudent isCopy = new IntelligentStudent(is);
        // Because we know which class they belong to, we have used the correct copy constructor.
        // What if we do not know which class they belong to?

        Student st1 = st.copy();
        System.out.println(st1.getName());
        st1 = is.copy();
        System.out.println(st1.getName());

        // We can call the copy method on both objects without knowing their specific types.
        StudentUtility.createCopy(st);
        StudentUtility.createCopy(is);

        // Now let's see the usage of Registry
        Student dataScienceStudent = new Student(3, "Data Science Student", 3.9, 2025);
        dataScienceStudent.setCourse("Data Science Student");
        dataScienceStudent.setLengthOfProgram(4);
        dataScienceStudent.setCostOfProgram(15000);

        Student academyStudent = new Student(4, "Academy Student", 3.7, 2025);
        academyStudent.setCourse("Academy Student");
        academyStudent.setLengthOfProgram(3);
        academyStudent.setCostOfProgram(12000);

        Student devopsStudent = new Student(5, "DevOps Student", 3.6, 2025);
        devopsStudent.setCourse("DevOps Student");
        devopsStudent.setLengthOfProgram(2);
        devopsStudent.setCostOfProgram(10000);

        Student softwareStudent = new Student(6, "Software Student", 3.8, 2025);
        softwareStudent.setCourse("Software Student");
        softwareStudent.setLengthOfProgram(4);
        softwareStudent.setCostOfProgram(14000);

        // To create more of similar objects, we can create some templates in a registry
        // and then use those templates to create new objects, with some customizations.

        // We can create something called a StudentRegistry

        // Using Registry to create new students
        StudentRegistry studentRegistry = new StudentRegistry();
        Student student5 = studentRegistry.get("DataScienceStudent");

        // To make it better we can use ENUM
    }
}
