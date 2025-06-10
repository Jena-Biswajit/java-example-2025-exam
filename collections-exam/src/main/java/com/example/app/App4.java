package com.example.app;

import java.util.Stack;

//Given parathensis in a string. Check if it is balanced then return true otherwise false.
public class App4 {
    public static void main(String[] args) {

        String s = "[[{{{}}}]]";
        boolean result = isValid(s);
        System.out.println(result);

    }
    private static boolean isValid(String str){
        Stack<Character> characterStack = new Stack<>();

        // store the string into a char array to check each index repeatedly
        char[] ch = str.toCharArray();
        for (int i = 0 ; i< ch.length ; i++){

            // check for opening character if found then push to stack
            if(ch[i] == '(' || ch[i] == '{' || ch[i] == '['){
                characterStack.push(ch[i]);
            }

            // check for closing parentheses if found check if opening bracket is present or not
            // if not present return false if present fetch top element and compare
            else if (ch[i] == ')' || ch[i] == '}' || ch[i] == ']'){
                if(characterStack.isEmpty()){
                    return false ;
                }
                char top = characterStack.pop();

                // if top element is not equal to opening element return false else return true
                if ((ch[i] =='(' && top != ')') ||
                        (ch[i] =='{' && top != '}') ||
                        (ch[i] =='[' && top != ']')  ){

                    return false;
                }
            }

        }
       return characterStack.isEmpty();
    }
}
