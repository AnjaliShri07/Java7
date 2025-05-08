package com.TrickyPrograms.polymorphism;

class One{
    public static void print(){
        System.out.println("1");
    }
}

class Two extends One{
    public static void print(){
        System.out.println("2");
    }
}

public class PolyDemo2{
    public static void main(String[] args){
        One one = new Two();
        one.print(); // Static method call resolved at compile time, based on reference type
        Two two = new Two();
        two.print();
    }
}

/*
the print method is a static method in both classes One and Two. Static methods are associated with the
class rather than instances of the class, which means they do not participate in polymorphism and are resolved
at compile time based on the reference type.*/
