package com.demoPrograms;

class Vehicle {
    // super class &gt;&gt; Vehicle
}
 
public class Car extends Vehicle {
 
    // sub class &gt;&gt; Car which extends Vehicle
 
    public static void main(String[] args) {
 
        // creating an object of type Car
        Car newCar = new Car();
 
        // checking whether newCar object is an instance of type Vehicle or NOT
        if(newCar instanceof Vehicle) {
            System.out.println("newCar object is an instance of type Vehicle");
        }
        else{
            System.out.println("newCar object is NOT an instance of type Vehicle");
        }
    }
}

/*Explanation:

*There are 2 classes viz.; Vehicle and Car
*Relationship between them is, Car IS-A Vehicle (extends)
*Actually, we have created an object of type Car
*But when compared with its super type class Vehicle, still it evaluates to true and corresponding message 
*prints in the console
*It means, if we create object of sub class type and compare with super class type using instanceof operator, 
evaluates true considering there exists a IS-A relationship between them*/