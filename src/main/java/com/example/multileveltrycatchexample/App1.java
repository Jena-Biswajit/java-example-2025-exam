package com.example.multileveltrycatchexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App1 {
    public static void main(String[] args) {
        try {
            int result = 10/0 ;
            System.out.println("try-1");
            String class1 = "com.abc.example";
            Class.forName(class1);
            FileInputStream fileInputStream = new FileInputStream("abc.txt");
            System.out.println(" file reading start ");
        } catch (ArithmeticException e) {
            System.out.println("AE occured");
            System.out.println("catch-1");
        } catch (FileNotFoundException e) {
            System.out.println("FNF occured");
            System.out.println("catch-2");
        } catch (ClassNotFoundException e) {
            System.out.println("catch-3");
        }
    }
}
