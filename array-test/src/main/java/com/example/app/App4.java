package com.example.app;


import java.util.Arrays;

// convert row column into index
public class App4 {
    public static void main(String[] args) {
        int [][]twoDArray = {{10,12},{13,14}};
        int row = 2;
        int column = 2;

        getIndex(twoDArray,row,column);

        int index = 3 ;
        int []pos = getPos(twoDArray , index);
        System.out.println("index "+ index + "is at the position ("+pos[0] +","+ pos[1] +")");
    }

    public static void getIndex(int [][]arr , int row, int column){
        for(int i =0 ; i<row ; i++){
            for (int j =0; j<column ; j++){
                int index = i*column+j;
                System.out.println("element :"+ arr[i][j] +" at ("+i+","+j+")" + "->"+ index);
            }
        }
    }


   // convert index to row and column
    public static int[] getPos(int [][]arr , int index){
        int columns = arr[0].length;
        int rows = index/columns ;
        int column = index%columns;
        return new int[]{rows,column};
    }
}
