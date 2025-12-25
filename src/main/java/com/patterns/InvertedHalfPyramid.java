package com.patterns;

public class InvertedHalfPyramid {

    public static void main(String[] args)
    {
        int rows = 5; // Number of rows

        for(int i = rows; i >= 1; i--) // Loop for each row from rows to 1
        {
            for(int j = 1; j <= i; j++) // Loop for each column in the current row
            {
                System.out.print("* "); // Print asterisk
            }
            System.out.println(); // Move to the next line after each row
        }
    }

}
