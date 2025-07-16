package DesignPrinciplesAndPatterns.Factory.V1;

import DesignPrinciplesAndPatterns.Factory.V1.components.Button.Button;
import DesignPrinciplesAndPatterns.Factory.V1.components.Button.IOSButton;

public class IOS extends Platform {
    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
