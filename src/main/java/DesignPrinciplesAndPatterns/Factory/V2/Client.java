package DesignPrinciplesAndPatterns.Factory.V1;

import DesignPrinciplesAndPatterns.Factory.V1.components.Button.AndroidButton;
import DesignPrinciplesAndPatterns.Factory.V1.components.Button.Button;
import DesignPrinciplesAndPatterns.Factory.V1.components.Button.IOSButton;
import DesignPrinciplesAndPatterns.Factory.V1.components.Dropdown.AndroidDropdown;
import DesignPrinciplesAndPatterns.Factory.V1.components.Dropdown.Dropdown;
import DesignPrinciplesAndPatterns.Factory.V1.components.Dropdown.IOSDropdown;

public class Client {
    public static void main(String[] args) {
        Platform p = new Android();
        // Based on the platform, we want to create new Buttons
        // This is a violation of the Open/Closed Principle
        // This is in very layman terms, we will go with an if else statement
//        Button button = null;
//        if(p instanceof Android) {
//            button = new AndroidButton();
//        }
//        else if(p instanceof IOS) {
//            button = new IOSButton();
//        }

        Button button = p.createButton();
        // If it is Android, it will create AndroidButton
        // If it is IOS, it will create IOSButton

        // Factory V1: Using Simple Factory Method Pattern

        button.click();

        Dropdown dropdown = null;
        if(p instanceof Android) {
            dropdown = new AndroidDropdown();
        }
        else if(p instanceof IOS) {
            dropdown = new IOSDropdown();
        }

        dropdown.showOptions();

        // Factory V0 - Basic

        // Option 2: Move if-else to a dedicated factory class
        // But we can notice that the decision is being taken on the basis of the object type
        // Why not we go with run-time polymorphism?
        // Take help of Platform class to create the button and dropdown
    }
}
