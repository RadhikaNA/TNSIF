package com.radhika.assignment1.employees;

/**
 * Represents a Manager who is an Employee with an additional department field.
 */
public class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    // Getter and Setter for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Overriding the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}
