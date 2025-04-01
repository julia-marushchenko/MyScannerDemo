// Java program to read data of various types using class Scanner
package com.scanning;

import java.util.Scanner;

// Main class
public class Main {

    // Method main to run java program
    public static void main(String[] args) {

        // Declare the object and initialize with predefined standard input
        Scanner scanner = new Scanner(System.in);

        // String input
        String name = scanner.nextLine();

        // Character input
        char gender = scanner.next().charAt(0);

        // Numerical data type byte, shor, int, float, double and long can be read similar way
        int age = scanner.nextInt();
        long mobileNumber = scanner.nextLong();

        // Print the values to check if the input was correct obtained
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNumber);
        
    }
}