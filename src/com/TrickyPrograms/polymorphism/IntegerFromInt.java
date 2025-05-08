package com.TrickyPrograms.polymorphism;

class A
{
    void method(int i)
    {
        System.out.println("int");
    }
}
class B extends A
{
    void method(Integer i)
    {
        System.out.println("Integer");
    }
}

public class IntegerFromInt {
    public static void main(String[] args) {
        A a = new B();
        a.method(2);
        System.out.println("========================");
        B b = new B();
        b.method(2);
    }
}
