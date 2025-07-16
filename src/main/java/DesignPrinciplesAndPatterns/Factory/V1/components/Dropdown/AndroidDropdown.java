package DesignPrinciplesAndPatterns.Factory.V1.components.Dropdown;

public class AndroidDropdown implements Dropdown {
    @Override
    public void showOptions() {
        System.out.println("Android Dropdown options displayed!");
    }
}
