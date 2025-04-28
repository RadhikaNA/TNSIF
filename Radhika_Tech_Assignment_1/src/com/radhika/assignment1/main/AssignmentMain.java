package com.radhika.assignment1.main;

import com.radhika.assignment1.employees.Developer;
import com.radhika.assignment1.employees.Manager;
import com.radhika.assignment1.utilities.EmployeeUtilities;

/**
 * Main class to demonstrate the use of Java packages and access modifiers.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Creating Manager object
        Manager manager = new Manager("Alice Johnson", 101, 75000, "IT");
        System.out.println("Manager Details:");
        EmployeeUtilities.printEmployeeDetails(manager);

        // Creating Developer object
        Developer developer = new Developer("Bob Smith", 102, 60000, "Java");
        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printEmployeeDetails(developer);

        // Increasing salary
        System.out.println("\nApplying Salary Increase:");
        EmployeeUtilities.increaseSalary(manager, 10);
        EmployeeUtilities.increaseSalary(developer, 15);
    }
}

