package com.example.customexception;

public class MyCustomCheckedException extends Exception{
    public MyCustomCheckedException(String message){
        super(message);
    }
    public MyCustomCheckedException (String message , Throwable throwable){
        super(message,throwable);
    }
}
