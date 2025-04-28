package com.radhika.assignment2;

import java.util.Scanner;

/**
 * Circle class to calculate the area of a circle.
 */
public class Circle {
    private double radius;
    private String color;

    // Method to accept circle details
    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        scanner.nextLine(); // Consume newline
        System.out.print("Enter the color of the circle: ");
        color = scanner.nextLine();

        scanner.close();
    }

    // Method to calculate and display area
    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("\nCircle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getInput();
        circle.calcArea();
    }
}
