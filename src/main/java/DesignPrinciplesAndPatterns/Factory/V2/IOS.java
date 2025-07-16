package DesignPrinciplesAndPatterns.Factory.V2;

import DesignPrinciplesAndPatterns.Factory.V2.components.Button.Button;
import DesignPrinciplesAndPatterns.Factory.V2.components.Button.IOSButton;

public class IOS extends Platform {
//    @Override
//    public Button createButton() {
//        return new IOSButton();
//    }
    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new IOSUIComponentFactory();
    }
}
