package com.example.app;

// Sort an Employee array using comparator by name, comparator by city


import java.util.Arrays;
import java.util.Comparator;

class Employees4{
   public int id ;
   public String name ;
   public String city ;

   public Employees4(int id , String name , String city ){
       this.id = id ;
       this.name = name ;
       this.city = city ;
   }

    @Override
    public String toString() {
        return "Employees4{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
public class App7 {
    public static void main(String[] args) {
        Employees4[] employees4 = {new Employees4(100 , "john","indiana"),
                new Employees4(101 , "rubina","san fransisco"),
                new Employees4(102 , "jackie" , "olkhama"),
                new Employees4(103, "suhana" , "la")};

        // sort by name

        Arrays.sort(employees4, new Comparator<Employees4>() {
            @Override
            public int compare(Employees4 employees4, Employees4 employees5) {
                return employees4.name.compareTo(employees5.name);
            }
        });

        System.out.println("sort by name ");
        for (Employees4 e : employees4){
            System.out.println(e);
        }

        // compare by city

        Arrays.sort(employees4, new Comparator<Employees4>() {
            @Override
            public int compare(Employees4 employees4, Employees4 employees5) {
                return employees4.city.compareTo(employees5.city);
            }
        });

        System.out.println("sort by city");
        for (Employees4 e : employees4){
            System.out.println(e);
        }
    }
}
