package com.java.concepts.immutable;

import java.util.*;

public class ImmutableMap {
    private final int id;
    private final String name;
    private final Map<String, String> testMap;

    // Constructor
    public ImmutableMap(int id, String name, HashMap<String, String> testMap) {
        this.id = id;
        this.name = name;
        // Perform deep copy of the mutable HashMap
        this.testMap = new HashMap<>(testMap);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getTestMap() {
        // Return an unmodifiable map to ensure immutability
        return Collections.unmodifiableMap(testMap);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a HashMap to pass into the constructor
        HashMap<String, String> testMap = new HashMap<>();
        testMap.put("key1", "value1");
        testMap.put("key2", "value2");

        // Creating an Employee object
        ImmutableMap emp = new ImmutableMap(1, "John Doe", testMap);

        // Printing out employee details
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee TestMap: " + emp.getTestMap());

        // Trying to modify the testMap (will throw UnsupportedOperationException)
        try {
            emp.getTestMap().put("key3", "value3");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify testMap. It's immutable.");
        }

        // Check original testMap after attempted modification
        System.out.println("Employee TestMap after attempt to modify: " + emp.getTestMap());
    }
}
