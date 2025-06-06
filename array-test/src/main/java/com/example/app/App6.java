package com.example.app;

// Reverse Sort an Employee array using comparble by id.


import java.util.Arrays;

class Employee3 implements Comparable<Employee3>{
    public int id ;
    public String name ;

    public Employee3(int id , String name){
        this.id = id ;
        this.name = name ;
    }

    @Override
    public int compareTo(Employee3 employee3) {
        return Integer.compare(employee3.id , this.id);
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class App6 {
    public static void main(String[] args) {
        Employee3[] employee3 = {new Employee3(101 , "Aahan"),
                                 new Employee3(102,"dharam")};

        Arrays.sort(employee3);

        System.out.println("employee reverse order sorted by ID");

        for (Employee3 e : employee3){
            System.out.println(e);
        }

    }
}
