package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Main");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Hello, " + name + " Welcome to the GeeksforGeeks.");

        sc.close();  // Close the scanner
    }
}
