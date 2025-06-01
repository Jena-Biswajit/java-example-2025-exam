package com.example.app;

import com.example.models.Employee;

public class App1 {
    public static void main(String[] args) {
        // why we need methods

        Employee e1 = createEmployee(100 , "biswa" , 500);
        Employee e2 = createEmployee(101 , "john" , 600);
        Employee e3 = createEmployee(102 , "alice" , 700);


        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

    }

    private static Employee createEmployee(int id , String name , int salary){
        Employee e = new Employee();
        e.id = id ;
        e.name = name ;
        e.salary = salary ;
        return e ;

    }
}
