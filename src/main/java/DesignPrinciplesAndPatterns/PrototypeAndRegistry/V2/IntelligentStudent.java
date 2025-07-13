package DesignPrinciplesAndPatterns.PrototypeAndRegistry.V2;

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

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }

    // Getters and Setters
    public int getIq() {
        return iq;
    }
    public void setIq(int iq) {
        this.iq = iq;
    }

}
