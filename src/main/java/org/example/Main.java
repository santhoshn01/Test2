package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Main");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);
        
        // Unused variable - will trigger a code smell
        int unusedVariable = 42;

        try {
            // Empty catch block - bad practice and usually flagged
        } catch (Exception e) {
        }
    }
}

