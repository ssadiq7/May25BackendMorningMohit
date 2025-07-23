package DesignPrinciplesAndPatterns.Strategy.V1;

public class UsernameLogin implements LoginStrategy {
    @Override
    public void login() {
        System.out.println("UsernameLogin");
    }
}
