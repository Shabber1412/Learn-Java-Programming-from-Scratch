package com.patterns;

public class InvertedHalfPyramid2 { 
    //180 degree rotated half pyramid
    public static void main(String[] args)
    {
        int rows = 5; // Number of rows

        for(int i = 1; i <= rows; i++) // Loop for each row
        {
            // Print spaces before asterisks
            for(int j = 1; j <= rows - i; j++) 
            {
                System.out.print(" "); // Print space
            }
            // Print asterisks
            for(int k = 1; k <= i; k++) 
            {
                System.out.print("*"); // Print asterisk
            }
            System.out.println(); // Move to the next line after each row
        }
    }



}
