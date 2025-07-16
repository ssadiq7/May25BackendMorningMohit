package DesignPrinciplesAndPatterns.Factory.V3;

import DesignPrinciplesAndPatterns.Factory.V3.components.Button.AndroidButton;
import DesignPrinciplesAndPatterns.Factory.V3.components.Button.Button;
import DesignPrinciplesAndPatterns.Factory.V3.components.Dropdown.AndroidDropdown;
import DesignPrinciplesAndPatterns.Factory.V3.components.Dropdown.Dropdown;

public class AndroidUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
