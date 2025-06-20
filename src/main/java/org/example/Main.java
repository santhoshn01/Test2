package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Main");

        // Unused variable - will trigger a code smell
        int unusedVariable = 42;

        try {
            // Empty catch block - bad practice and usually flagged
        } catch (Exception e) {
        }
    }
}

