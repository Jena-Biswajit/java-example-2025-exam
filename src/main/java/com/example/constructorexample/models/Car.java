package com.example.constructorexample.models;

public class Car extends Vehicle{

    public String color ;
    public int noOfTyre ;

    public Car(){
        super(4);
    }

    public void cardDetails(){
        color = "brown";
        noOfTyre = 4 ;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ",tyre=" + super.gear  +
                ", noOfTyre=" + noOfTyre +
                '}';
    }
}
