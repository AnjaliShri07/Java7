package com.TrickyPrograms.polymorphism;

class SuperClass{
    Long get() {
        return 2L;
    }
}

public class COVarientsDemo1 extends SuperClass{

    /*Integer get() {
        return  1;
    }
*/

    public static void main(String[] args) {
        COVarientsDemo1 s1 = new COVarientsDemo1();
        System.out.println(s1.get());

    }

}

