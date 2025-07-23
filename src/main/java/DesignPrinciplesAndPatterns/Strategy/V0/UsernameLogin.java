package DesignPrinciplesAndPatterns.Strategy.V0;

public class UsernameLogin implements LoginStrategy {
    @Override
    public void login() {
        System.out.println("UsernameLogin");
    }
}
