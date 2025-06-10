package com.example.app;

import java.util.Stack;

public class App1 {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

        // push stack element
        integerStack.push(10);
        integerStack.push(11);
        System.out.println(integerStack);


//         pop stack element
        while (!integerStack.isEmpty()){
            System.out.println(integerStack.pop());
        }

        // peek operation
        System.out.println(integerStack.peek());
    }
}
