package DesignPrinciplesAndPatterns.Strategy.V1;

public class OTPLogin implements LoginStrategy {
    @Override
    public void login() {
        System.out.println("OTPLogin");
    }
}
