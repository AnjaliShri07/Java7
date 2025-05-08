package com.TrickyPrograms.inheritance;

public class BaseClass {
	private void foo() {
        System.out.println("In BaseClass.foo()");
    }

    void bar() {
        System.out.println("In BaseClass.bar()");
    }

    public static void main(String[] args) {
        BaseClass po = new DerivedClass();
        po.foo(); // BASE_FOO_CALL
        po.bar();
    }
}

class DerivedClass extends BaseClass {
    void foo() {
        System.out.println("In Derived.foo()");
    }

    void bar() {
        System.out.println("In Derived.bar()");
    }
}
/*
 * The foo() method in BaseCase is a private method and we can't override the
 * private method in the DerivedClass subclass so JVM will call only overridden
 * methods in subclass at runtime that is why the foo() method in DerivedClass
 * is not an overridden method so JVM will call BaseClass foo() method.
 */