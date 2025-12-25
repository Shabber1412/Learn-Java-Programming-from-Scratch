package com.patterns;

public class HalfPyramid {

    public static void main(String[] args)
    {
        int rows = 6; // Number of rows

        for(int i = 1; i <= rows; i++) // Loop for each row
        {
            for(int j = 1; j <= i; j++) // Loop for each column in the current row
            {
                System.out.print("* "); // Print asterisk
            }
            System.out.println(); // Move to the next line after each row
        }
    }

}
