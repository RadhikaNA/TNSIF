package com.radhika.assignment1.utilities;

import com.radhika.assignment1.employees.Employee;

/**
 * Utility class for performing operations on Employee objects.
 */
public class EmployeeUtilities {

    /**
     * Increases the salary of an employee by a given percentage.
     *
     * @param employee The employee whose salary is to be increased.
     * @param percentage The percentage increase.
     */
    public static void increaseSalary(Employee employee, double percentage) {
        double newSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);
        employee.setSalary(newSalary);
        System.out.println("New salary after " + percentage + "% increment: $" + newSalary);
    }

    /**
     * Displays basic employee details.
     *
     * @param employee The employee whose details are to be displayed.
     */
    public static void printEmployeeDetails(Employee employee) {
        employee.displayDetails();
    }
}
