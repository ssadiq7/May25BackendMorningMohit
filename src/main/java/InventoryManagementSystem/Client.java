package InventoryManagementSystem;

import InheritanceAndConstructors.A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();

        items.add(new Electronics("E1", "Laptop", 5 , 999.99, 24));
        items.add(new Clothing("C1", "T-Shirt", 100 ,19.99, "M"));
        items.add(new Book("B1", "Java Programming", 50, 59.99, "John Doe"));
        System.out.println("Items List : ");
        for (Item item : items) {
            System.out.println(item.getName() + ": " + item.getPrice());
        }
        System.out.println("********************************");
        // sort this list
        // Custom classes don't have any sorting order until you define it
        // default sorting order to a class : Comparable
        Collections.sort(items);
        System.out.println("Sorted Items List : ");
        for (Item item : items) {
            System.out.println(item.getName() + " : " + item.getPrice());
        }

        System.out.println("******************************");
        System.out.println("Electronics Inventory");
        Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.add(new Electronics("E1", "Laptop",5 ,  999.99 , 24));
        electronicsInventory.add(new Electronics("E2", "Laptop",5 ,  999.99 , 24));
        electronicsInventory.add(new Electronics("E3", "Mobile",5, 99.99, 24));

        System.out.println("Items List from the Inventory : ");
        for (Item item : electronicsInventory.getAllItems()) {
            System.out.println(item.getName() + ": " + item.getPrice());
        }

        Inventory<Book> booksInventory = new Inventory<>();
        Inventory<Clothing> clothingsInventory = new Inventory<>();
        Inventory<Item> itemsInventory = new Inventory<>();
    }
}
