package com.TrickyPrograms.polymorphism;

class GFG
{
    protected void getData()
    {
        System.out.println("Inside GFG");
    }
}
class GeeksforGeeks extends GFG
{
    protected void getData()
    {
        System.out.println("Inside GeeksforGeeks");
    }
}

public class ProtectedDemo
{
    public static void main(String[] args)
    {
        GFG obj = new GeeksforGeeks();
        obj.getData();
    }
}
