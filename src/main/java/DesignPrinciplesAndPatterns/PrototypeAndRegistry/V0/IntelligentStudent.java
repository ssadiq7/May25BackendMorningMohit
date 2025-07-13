package DesignPrinciplesAndPatterns.PrototypeAndRegistry.V0;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent(int id, String name, double psp, int gradYear, int iq) {
        super(id, name, psp, gradYear);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }

}
