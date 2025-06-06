package com.example.app;

import java.util.Arrays;
import java.util.Comparator;


// Reverse Sort an Employee array using comparator by name
class Employees1{
    public int id ;
    public String name ;

    public Employees1(int id , String name ){
        this.id = id ;
        this.name = name ;
    }

    @Override
    public String toString() {
        return "Employees1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class App5 {
    public static void main(String[] args) {
        Employees1 [] employees1 = {new Employees1(100 , "john"),
                                    new Employees1(101,"alice"),
                                    new Employees1(103,"zahir")};

        // reverse sort by name
        Arrays.sort(employees1, new Comparator<Employees1>() {
            @Override
            public int compare(Employees1 e1, Employees1 e2) {
                return e2.name.compareTo(e1.name);
            }
        });

        // print sorted employee
        System.out.println(" employee sorted reverse array by name ");
        for (Employees1 e : employees1){
            System.out.println(e);
        }
    }
}
