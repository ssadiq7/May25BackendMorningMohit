package DesignPrinciplesAndPatterns.Factory.V2;

import DesignPrinciplesAndPatterns.Factory.V2.components.Button.AndroidButton;
import DesignPrinciplesAndPatterns.Factory.V2.components.Button.Button;

public class Android extends Platform {

//    @Override
//    public Button createButton() {
//        return new AndroidButton();
//    }


    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
