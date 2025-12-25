package com.patterns;

public class InvertedHalfPyramidWithNumbers {

    public static void main(String[] args)
    {
        int rows = 5; // Number of rows

        for(int i = 1; i <= rows; i++) // Loop for each row from rows to 1
        {
            for(int j = 1; j <= rows-i+1; j++) // Loop for each column in the current row
            {
                System.out.print(j+" "); // Print numbers
            }
            System.out.println(); // Move to the next line after each row
        }
    }

}
