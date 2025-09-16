package LLD3.DesignAPen;

public abstract class Pen {
    private String name;
    private int price;
    private String brand;
    private ClosingType closingType;
    private PenType penType;
    OpenCloseStrategy openCloseStrategy;

    public void write() {
        System.out.println("Pen is writing");
    }

    public void open() {
        openCloseStrategy.open();
    }

    public void close() {
        openCloseStrategy.close();
    }
}
