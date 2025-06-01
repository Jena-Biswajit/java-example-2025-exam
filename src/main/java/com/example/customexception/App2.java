package com.example.customexception;

public class App2 {
    public static void main(String[] args) throws MyCustomCheckedException{
        try {
            Class.forName("com.abc.abc");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
