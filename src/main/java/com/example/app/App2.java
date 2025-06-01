package com.example.app;

import com.example.models.Employee;

public class App2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 400 ;
        e1.salary = 1000 ;
        e1.name = "john";
        System.out.println(e1.hashCode());

        Employee e2 = new Employee();
        e2.id = 500 ;
        e2.salary = 2000 ;
        e2.name = "abc";
        System.out.println(e2.hashCode());

        Employee e3 = new Employee();
        e3.id = 400 ;
        e3.salary = 2000 ;
        e3.name = "cbz";
        System.out.println(e3.hashCode());

        System.out.println(e1 == e2 );    // always false because of refernce comparision
        System.out.println(e1 == e3 );
        System.out.println(e2 == e3 );


        // now it will compare based on the value because override of equals object class
        System.out.println(e1.equals(e2)); // also false because the id is different
        System.out.println(e1.equals(e3));  // true
        System.out.println(e2.equals(e3)); //

    }
}
