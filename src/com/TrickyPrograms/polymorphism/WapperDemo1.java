package com.TrickyPrograms.polymorphism;

/*

class A1{
    public void area(Integer value) {
        System.out.println("Integer " + value);
    }
}
class B1 extends A1{
    public Long area(Integer value) {
        System.out.println("Long " + value);
        return value;
    }
}
public class WapperDemo1 {
    public static void main(String[] args) {
        A1 a= new B1();
        a.area(10);
        a.area(null);
    }
}
*/


/*
The code you provided will result in a compilation error.
it must have the same return type or a covariant return type (a subtype of the return type of the method in the superclass),
and it must have the same parameter list.*/
