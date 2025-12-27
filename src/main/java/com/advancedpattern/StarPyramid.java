package com.advancedpattern;

public class StarPyramid {

    public static void main(String[] args)
    {
        int rows = 5; // Number of rows

        for(int i = 1; i <= rows; i++) // Loop for each row
        {
            for(int j = 1; j <= rows - i; j++) // Print leading spaces
            {
                System.out.print(" ");  // Print space
            }

            for(int k = 1; k <= (2 * i - 1); k++)  // Loop for each column in the current row
            {
                System.out.print("*");   // Print star
            }

            System.out.println();  // Move to the next line after each row

        }

    }

}
