package DesignPrinciplesAndPatterns.Factory.V0.components.Dropdown;

public class IOSDropdown implements Dropdown {
    @Override
    public void showOptions() {
        System.out.println("iOS Dropdown options displayed!");
    }
}
