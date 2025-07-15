package DesignPrinciplesAndPatterns.Factory.V2;

import DesignPrinciplesAndPatterns.Factory.V2.components.Button.AndroidButton;
import DesignPrinciplesAndPatterns.Factory.V2.components.Button.Button;
import DesignPrinciplesAndPatterns.Factory.V2.components.Button.IOSButton;
import DesignPrinciplesAndPatterns.Factory.V2.components.Dropdown.AndroidDropdown;
import DesignPrinciplesAndPatterns.Factory.V2.components.Dropdown.Dropdown;

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
