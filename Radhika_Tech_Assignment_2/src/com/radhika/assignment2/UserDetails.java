package com.radhika.assignment2;

import java.util.Scanner;

/**
 * A program to get user details and display them.
 */
public class UserDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Full Name with Initial: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter Grade: ");
        char grade = scanner.next().charAt(0);

        System.out.print("Enter Percentage: ");
        double percentage = scanner.nextDouble();

        // Displaying output
        System.out.println("\n" + name);
        System.out.println(rollNumber);
        System.out.println("\t" + grade);
        System.out.println("\t" + percentage + "%");

        scanner.close();
    }
}
