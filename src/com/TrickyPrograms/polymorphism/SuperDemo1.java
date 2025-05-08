package com.TrickyPrograms.polymorphism;

class Base1 {
    public Base1() {
        System.out.print("Base 1");
    }

    public Base1(String s) {
        System.out.print("Base1: " + s);
    }
}

class Derived2 extends Base1 {
    public Derived2(String s) {
        //super(); // Stmt-1
        super(s); // Stmt-2
        System.out.print(" Derived 2");
    }
}
public class SuperDemo1 {
    public static void main(String[] args) {
        Base1 base = new Derived2("Hello ");
    }
}


/*
b) Removing Stmt-1 will make the program compilable and it will print the following: Base: Hello Derived.
c) Removing Stmt-2 will make the program compilable and it will print the following: Base Derived.
d) Removing both Stmt-1 and Stmt-2 will make the program compilable and it will print the following: Base Derived.*/
