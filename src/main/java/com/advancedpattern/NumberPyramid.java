package com.advancedpattern;

public class NumberPyramid {

    public static void main(String[] args)
    {
        int rows = 10; // Number of rows

        for(int i = 1; i <= rows; i++) // Loop for each row
        {
            for(int j = 1; j <= rows - i; j++) // Print leading spaces
            {
                System.out.print(" "); 
            }
            for(int k = 1; k <= i; k++) // Loop for each column in the current row
            {
                System.out.print(k + " "); // Print numbers
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
