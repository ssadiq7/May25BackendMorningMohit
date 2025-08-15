package FoodOrderingSystem.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String id;
    private String name;
    private String location;
    private boolean isOpen;
    private List<MenuItem> menu;

    public Restaurant(String id, String name, String location, boolean isOpen, List<MenuItem> menu) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.isOpen = isOpen;
        this.menu = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public void addMenuItem(MenuItem item) {
        this.menu.add(item);
    }

    public void setMenu(List<MenuItem> menu) {
        this.menu = menu;
    }
}
