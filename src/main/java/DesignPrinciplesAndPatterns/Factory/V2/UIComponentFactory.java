package DesignPrinciplesAndPatterns.Factory.V2;

import DesignPrinciplesAndPatterns.Factory.V2.components.Button.Button;
import DesignPrinciplesAndPatterns.Factory.V2.components.Dropdown.Dropdown;

public interface UIComponentFactory {
    //  To reduce the burden on Platform class, we will move the creation of UI components to a factory interface.
    Button createButton();
    Dropdown createDropdown();
//    Menu createMenu();
    // And so on, for other UI components like Menu, TextField, etc.
}
