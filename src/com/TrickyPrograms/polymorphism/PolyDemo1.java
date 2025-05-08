package com.TrickyPrograms.polymorphism;

class Base {
    public Base() {
        System.out.println("Base");
    }
}

class Derived1 extends Base {
    public Derived1() {
        System.out.println("Derived");
    }
}

class DeriDerived extends Derived1 {
    public DeriDerived() {
        System.out.println("DeriDerived");
    }
}

public class PolyDemo1 {
    public static void main(String[] args) {
        System.out.println("======== Derived1 to base ===========");
        Base base = new Derived1();
        System.out.println("======== DeriDerived to base ===========");
        Base base1 = new DeriDerived();
        System.out.println("======== DeriDerived to Derived ===========");
        Derived1 b = new DeriDerived();
        System.out.println("========= DeriDerived ==========");
        DeriDerived dd = new DeriDerived();

    }
}
