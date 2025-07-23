package DesignPrinciplesAndPatterns.Strategy.V1;

public class GoogleLogin implements LoginStrategy {
    @Override
    public void login() {
        System.out.println("GoogleLogin");
    }
}
