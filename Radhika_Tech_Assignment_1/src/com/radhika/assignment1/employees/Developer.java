package com.radhika.assignment1.employees;

/**
 * Represents a Developer who is an Employee with an additional programming language field.
 */
public class Developer extends Employee {
    private String programmingLanguage;

    // Constructor
    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Getter and Setter for programming language
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
