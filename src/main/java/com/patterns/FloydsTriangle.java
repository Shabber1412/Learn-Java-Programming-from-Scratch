package com.patterns;

public class FloydsTriangle {

    public static void main(String[] args)
    {
        int rows = 6; // Number of rows
        int number = 1; // Starting number

        for(int i = 1; i <= rows; i++) // Loop for each row
        {
            for(int j = 1; j<= i; j++) // Loop for each column in the current row
            {
                System.out.print(number + " ");     // Print the current number
                number++;                      // Increment the number
            }
            System.out.println(); // Move to the next line after each row
        }
    }

}
