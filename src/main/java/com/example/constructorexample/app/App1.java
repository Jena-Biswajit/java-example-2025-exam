package com.example.constructorexample.app;

import com.example.constructorexample.models.Car;
import com.example.constructorexample.models.Vehicle;

public class App1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        System.out.println(vehicle);

        Car car = new Car();
        car.cardDetails();
    }
}
