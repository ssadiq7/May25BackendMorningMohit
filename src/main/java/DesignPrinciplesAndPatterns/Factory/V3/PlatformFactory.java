package DesignPrinciplesAndPatterns.Factory.V3;

public class PlatformFactory {
    public static Platform getPlatformByName(String platformName) {
        Platform p = null;
        if(platformName.equals("Android")) {
            p = new Android();
        }
        else if(platformName.equals("IOS")) {
            p = new IOS();
        }
        return p;
    }

}
