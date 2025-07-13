package DesignPrinciplesAndPatterns.PrototypeAndRegistry.V0;

public class Student {
    private int id;
    private String name;
    private double psp;
    private int gradYear;

    public Student(int id, String name, double psp, int gradYear) {
        this.id = id;
        this.name = name;
        this.psp = psp;
        this.gradYear = gradYear;
    }

    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
        this.psp = student.psp;
        this.gradYear = student.gradYear;
    }
}
