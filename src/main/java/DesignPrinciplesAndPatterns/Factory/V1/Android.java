package DesignPrinciplesAndPatterns.Factory.V1;

import DesignPrinciplesAndPatterns.Factory.V1.components.Button.AndroidButton;
import DesignPrinciplesAndPatterns.Factory.V1.components.Button.Button;

public class Android extends Platform {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
