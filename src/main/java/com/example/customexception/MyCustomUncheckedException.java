package com.example.customexception;

public class MyCustomUncheckedException extends Exception{

    public MyCustomUncheckedException(String message){
        super(message);
    }
    public MyCustomUncheckedException(String message , Throwable throwable){
        super(message , throwable);
    }
}
