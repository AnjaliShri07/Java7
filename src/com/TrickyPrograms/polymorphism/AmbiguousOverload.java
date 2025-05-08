package com.TrickyPrograms.polymorphism;

public class AmbiguousOverload {
    public void print(Integer i) {
        System.out.println("Integer");
    }

    public void print(int i) {
        System.out.println("int");
    }

    public void print(long i) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        AmbiguousOverload test = new AmbiguousOverload();
        test.print(10);
        test.print(Integer.valueOf(10));
        test.print(1L);
        test.print(-1);
    }
}
