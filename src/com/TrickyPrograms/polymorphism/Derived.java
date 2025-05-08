package com.TrickyPrograms.polymorphism;

class Test
{
    void myMethod()
    {
        System.out.println("GeeksforGeeks");
    }
}
public class Derived extends Test
{
    void myMethod()
    {
        System.out.println("GFG");
    }

    public static void main(String[] args)
    {
        /*Derived object = new Test();
        object.myMethod();*/
        Test t = new Derived();
        t.myMethod();
    }
}
