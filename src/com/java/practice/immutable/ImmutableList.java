package com.java.practice.immutable;

import java.util.*;

public class ImmutableList {
    private final int emp_id;
    private final String emp_name;
    private final List<Integer> emp_department;

    // Constructor
    public ImmutableList(int emp_id, String emp_name, List<Integer> emp_department) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        // Perform deep copy to ensure immutability
        this.emp_department = new ArrayList<>(emp_department);
    }

    // Getters
    public int getEmpId() {
        return emp_id;
    }

    public String getEmpName() {
        return emp_name;
    }

    public List<Integer> getEmp_department() {
        // Return an unmodifiable list to ensure immutability
        return Collections.unmodifiableList(emp_department);
    }

    // Main method to test the class
    public static void main(String[] args) {
        List<Integer> emp_departments = new ArrayList<>();
        emp_departments.add(101);
        emp_departments.add(102);

        ImmutableList emp = new ImmutableList(1, "John Doe", emp_departments);

        // Test immutability
        System.out.println("Employee Id: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Employee emp_departments: " + emp.getEmp_department());

        // Try to modify the emp_department list (will throw UnsupportedOperationException)
        try {
            emp.getEmp_department().add(103);
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify emp_department list. It's immutable.");
        }

        // Check original emp_department list (should not be affected)
        System.out.println("Employee emp_departments after attempt to modify: " + emp.getEmp_department());
    }
}
