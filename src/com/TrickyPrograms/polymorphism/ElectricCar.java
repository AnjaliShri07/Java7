package com.TrickyPrograms.polymorphism;

class Automobile {
    private String drive() {
        return "Driving vehicle";
    }
}

class Car extends Automobile {
    protected String drive() {
        return "Driving car";
    }
}

public class ElectricCar extends Car {

    @Override
    public final String drive() {
        return "Driving an electric car";
    }

    public static void main(String[] wheels) {
        Car car = new ElectricCar();
        System.out.print(car.drive());
        Automobile automobile = new Car();
        //System.out.println(automobile.drive());
        Automobile automobile1 = new ElectricCar();
        //System.out.println(automobile1.drive());
    }
}