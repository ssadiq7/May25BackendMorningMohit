package DesignPrinciplesAndPatterns.Strategy.V1;

// To implement Strategy design pattern we need bring in common interface first of all

public interface LoginStrategy {
    void login(); // Login request object because we want to implement all types of sign-in methods
}

// This interface is helping in consuming different objects easily
// which is part of runtime polymorphism