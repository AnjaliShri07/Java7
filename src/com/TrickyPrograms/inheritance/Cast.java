package com.TrickyPrograms.inheritance;

class BaseDemo {
    public void test() {
    	 System.out.println("Base class");
    }
}

class Base1 extends BaseDemo {
    public void test() {
         System.out.println("Base1");
    }
}

class Base2 extends BaseDemo {
    public void test() {
         System.out.println("Base2");
    }
}
public class Cast {
	public static void main(String[] args) {
		BaseDemo obj = new Base1();
        ((Base2) obj).test(); // CAST
        //obj.test();
    }
}
