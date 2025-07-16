package DesignPrinciplesAndPatterns.Factory.V3;

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
