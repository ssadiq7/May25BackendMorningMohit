package DesignPrinciplesAndPatterns.Strategy.V0;

public class OTPLogin implements LoginStrategy {
    @Override
    public void login() {
        System.out.println("OTPLogin");
    }
}
