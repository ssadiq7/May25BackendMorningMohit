package DesignPrinciplesAndPatterns.PrototypeAndRegistry.V3;

import java.io.Serializable;

public class Student implements Prototype<Student> {
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

    // We start having copy methods for each subclass
    // Control the flow of copying objects
    // It can use the original copy constructor
    @Override
    public Student copy() {
        return new Student(this);
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPsp() {
        return psp;
    }
    public void setPsp(double psp) {
        this.psp = psp;
    }
    public int getGradYear() {
        return gradYear;
    }
    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

}
