package com.example.customexception;

// custom unchecked exception
public class App1 {
    public static void main(String[] args) throws MyCustomUncheckedException{
        m1(10,0);
    }
    private static void m1(int num1 , int num2) throws MyCustomUncheckedException {
        try {
            int result = num1/num2;
        } catch (ArithmeticException e) {
            throw new MyCustomUncheckedException("division failed",e);
        }
    }
}
