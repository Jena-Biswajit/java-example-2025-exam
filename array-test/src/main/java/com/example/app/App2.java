package com.example.app;


// find max and min element in an array
class FindMAxMin{
    void maxElement(int []array){

        int max = array[0];
        int min = array[0];

        for(int i =1; i<array.length ; i++){
            if(array[i]> max){
                max = array[i];
            }
            if(array[i]< min){
                min = array[i];
            }
        }
        System.out.println("max element is :"+max);
        System.out.println("min element is :"+min);
    }


}

public class App2 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        FindMAxMin findMAxMin = new FindMAxMin();
        findMAxMin.maxElement(arr);

    }
}
