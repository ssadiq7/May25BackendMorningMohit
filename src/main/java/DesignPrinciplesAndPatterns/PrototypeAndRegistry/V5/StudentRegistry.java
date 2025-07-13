package DesignPrinciplesAndPatterns.PrototypeAndRegistry.V5;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry { // We can make is more generic by using generics here
    // This is a data storage for student templates
    // And for this we can use a Map or a List
    // "DataScience" => template
    // "Academy" => template
    // "DevOps" => template
    // "Software" => template

    private Map<StudentType, Student> students = new HashMap<>();

    public void add(StudentType key, Student student) {
        students.put(key, student);
    }

    public Student get(StudentType key) {
//        Student student = students.get(key);
//        if (student != null) {
//            return student.copy(); // Return a copy of the student template
//        }
//        return null; // Or throw an exception if not found
        return students.get(key).copy();
    }

//    public static void InitializeStudentRegistry(StudentRegistry registry) {
//        // Initialize the registry with some student templates
//        Student dataScienceStudent = new Student(3, "Data Science Student", 3.9, 2025);
//        dataScienceStudent.setCourse("Data Science");
//        dataScienceStudent.setLengthOfProgram(4);
//        dataScienceStudent.setCostOfProgram(15000);
//        registry.add("DataScience", dataScienceStudent);
//
//        Student academyStudent = new Student(4, "Academy Student", 3.7, 2025);
//        academyStudent.setCourse("Academy");
//        academyStudent.setLengthOfProgram(3);
//        academyStudent.setCostOfProgram(12000);
//        registry.add("Academy", academyStudent);
//
//        Student devopsStudent = new Student(5, "DevOps Student", 3.6, 2025);
//        devopsStudent.setCourse("DevOps");
//        devopsStudent.setLengthOfProgram(2);
//        devopsStudent.setCostOfProgram(10000);
//        registry.add("DevOps", devopsStudent);
//
//        Student softwareStudent = new Student(6, "Software Student", 3.8, 2025);
//        softwareStudent.setCourse("Software");
//        softwareStudent.setLengthOfProgram(4);
//        softwareStudent.setCostOfProgram(14000);
//        registry.add("Software", softwareStudent);
//    }

    // Let's do it all in the constructor for time being
    public StudentRegistry() {
        // Initialize the registry with some student templates
        Student dataScienceStudent = new Student(3, "Data Science Student", 3.9, 2025);
        dataScienceStudent.setCourse("Data Science");
        dataScienceStudent.setLengthOfProgram(4);
        dataScienceStudent.setCostOfProgram(15000);
//        add("DataScience", dataScienceStudent);

        Student academyStudent = new Student(4, "Academy Student", 3.7, 2025);
        academyStudent.setCourse("Academy");
        academyStudent.setLengthOfProgram(3);
        academyStudent.setCostOfProgram(12000);
//        add("Academy", academyStudent);

        Student devopsStudent = new Student(5, "DevOps Student", 3.6, 2025);
        devopsStudent.setCourse("DevOps");
        devopsStudent.setLengthOfProgram(2);
        devopsStudent.setCostOfProgram(10000);
//        add("DevOps", devopsStudent);

        Student softwareStudent = new Student(6, "Software Student", 3.8, 2025);
        softwareStudent.setCourse("Software");
        softwareStudent.setLengthOfProgram(4);
        softwareStudent.setCostOfProgram(14000);
//        add("Software", softwareStudent);

        students.put(StudentType.DATASCIENCE, dataScienceStudent);
        students.put(StudentType.ACADEMIC, academyStudent);
        students.put(StudentType.DEVOPS, devopsStudent);
        students.put(StudentType.SOFTWARE, softwareStudent);

        // We have now created a registry of student templates
        // Now we can use this registry to create new students based on these templates
    }
}
