package DesignPrinciplesAndPatterns.Factory.V1;

import DesignPrinciplesAndPatterns.Factory.V1.components.Button.Button;

public abstract class Platform {
    public void setRefreshRate() {
        System.out.println("Setting refresh rate for the platform.");
    }

    public abstract Button createButton();
}
