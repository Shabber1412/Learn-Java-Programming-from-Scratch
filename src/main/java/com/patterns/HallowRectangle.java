package com.patterns;

public class HallowRectangle {

    public static void main(String[] args){

        int rows = 5; // Number of rows
        int cols = 5; // Number of columns

        
        for(int i = 1; i <= rows; i++) // Loop for each row
        {
            for(int j = 1; j <= cols; j++) // Loop for each column
            {
                // Print asterisk for first and last row or first and last column
                if(i == 1 || i == rows || j == 1 || j == cols){
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print space for hollow part
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

}
