package com.patterns;

public class HalfPyramidWithNumbers {

    public static void main(String[] args)
    {
        int rows = 5;  // Number of rows

        for(int i = 1; i <= rows; i++)    // Loop for each row
        {
            for(int j = 1; j <= i; j++) // Loop for each column in the current row
            {
                System.out.print(j+" ");  // Print numbers
            }
            System.out.println(); // Move to the next line after each row
        }
    }

}
