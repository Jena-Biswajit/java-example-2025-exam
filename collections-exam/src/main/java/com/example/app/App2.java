package com.example.app;

import com.example.models.Employee;

import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee(10 ,"alice"));
        employeeArrayList.add(new Employee(20 ,"john"));
        employeeArrayList.add(new Employee(26 ,"rockey"));

//        System.out.println(employeeArrayList);


        ArrayList<Employee> filteredAgeArraylist = new ArrayList<>();

        for (int i =0 ; i<employeeArrayList.size() ; i++){
            Employee e = employeeArrayList.get(i);
            if (e.age> 18){
                filteredAgeArraylist.add(e);
            }
        }

        // print result

        for (Employee e : filteredAgeArraylist){
            System.out.println(e);
        }
    }
}
