package com.java.practice.designPattern;

class PerfectSingletonClass {

    // Private constructor to prevent instantiation
    private PerfectSingletonClass() {
        // Prevent instantiation through reflection
        if (SingletonHolder.instance != null) {
            throw new IllegalStateException("Instance is already created");
        }
    }

    // Static inner class - Inner classes are not loaded until they are referenced
    class SingletonHolder {
        // The Singleton instance is created when the inner class is loaded
        private static final PerfectSingletonClass instance = new PerfectSingletonClass();
    }

    public static PerfectSingletonClass getInstance() {
        return SingletonHolder.instance;
    }

    // Prevent Singleton from being cloned
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this object is not allowed");
    }

    // Prevent Singleton from being deserialized
    protected Object readResolve() {
        return getInstance();
    }


    // Example method to demonstrate functionality
    public void doSomething() {
        System.out.println("Singleton instance is working");
    }

}
public class PerfactSingleton{
    public static void main(String[] args) {
        // Retrieve the singleton instance
        PerfectSingletonClass instance1 = PerfectSingletonClass.getInstance();
        PerfectSingletonClass instance2 = PerfectSingletonClass.getInstance();

        // Check if both references point to the same instance
        System.out.println("Are both instances the same? " + (instance1 == instance2));

        // Call a method on the singleton instance
        instance1.doSomething();

    }
}
