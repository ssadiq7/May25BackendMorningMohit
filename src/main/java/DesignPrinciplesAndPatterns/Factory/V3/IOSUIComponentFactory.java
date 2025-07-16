package DesignPrinciplesAndPatterns.Factory.V3;

import DesignPrinciplesAndPatterns.Factory.V3.components.Button.Button;
import DesignPrinciplesAndPatterns.Factory.V3.components.Button.IOSButton;
import DesignPrinciplesAndPatterns.Factory.V3.components.Dropdown.Dropdown;
import DesignPrinciplesAndPatterns.Factory.V3.components.Dropdown.IOSDropdown;

public class IOSUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
