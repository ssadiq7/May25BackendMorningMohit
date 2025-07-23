package DesignPrinciplesAndPatterns.Strategy.V1;

import java.util.Scanner;

// This is Strategy Design Pattern
// The interface and the classes we created are Strategy

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your choice of login method: ");

        String choice =  scanner.nextLine();
//        LoginStrategy loginStrategy = null;
//        if(choice.equalsIgnoreCase("google")) {
//            loginStrategy = new GoogleLogin();
//        } else if(choice.equalsIgnoreCase("otp")) {
//            loginStrategy = new OTPLogin();
//        } else if(choice.equalsIgnoreCase("username")) {
//            loginStrategy = new UsernameLogin();
//        }

        // The above if-else code can be put in simple factory method

        LoginStrategy loginStrategy = LoginStrategyFactory.getLoginStrategy(choice);

        if(loginStrategy != null) {
            loginStrategy.login();
        } else {
            System.out.println("Login Failed");
        }
    }
}
