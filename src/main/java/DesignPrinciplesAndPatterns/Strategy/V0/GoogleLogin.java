package DesignPrinciplesAndPatterns.Strategy.V0;

public class GoogleLogin implements LoginStrategy {
    @Override
    public void login() {
        System.out.println("GoogleLogin");
    }
}
