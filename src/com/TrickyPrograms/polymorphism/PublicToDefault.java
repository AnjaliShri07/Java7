package com.TrickyPrograms.polymorphism;

class Parent{
    public void className(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    /*void className(){
        System.out.println("Child");
    }*/
}

public class PublicToDefault{
    public static void main(String[] args){
        Parent parent = new Child();
        parent.className();

    }
}

/*“Cannot reduce the visibility of the inherited method from Parent”.*/
