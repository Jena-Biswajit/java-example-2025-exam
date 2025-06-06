package com.example.app;

// stack overflow example

public class App1 {
    public static void main(String[] args) {
       recursiveMethod();
    }

    public static void recursiveMethod() {
        recursiveMethod();
    }
}
