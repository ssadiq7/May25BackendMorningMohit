package FoodOrderingSystem.model;

public class MenuItem {
    private String name;
    private double price;
    private boolean isAvailable;
    private int prepTime;

    public MenuItem(String name, double price, boolean isAvailable, int prepTime) {
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
        this.prepTime = prepTime;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getPrepTime() {
        return prepTime;
    }
}
