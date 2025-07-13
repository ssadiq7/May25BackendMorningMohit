package DesignPrinciplesAndPatterns.PrototypeAndRegistry.V3;

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
    }
}
