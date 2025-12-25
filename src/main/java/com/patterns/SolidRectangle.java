package com.patterns;

public class SolidRectangle {

    public static void main(String[] args)
    {
        int rows = 5; // Number of rows
        int cols = 5; // Number of columns

        for(int i = 1; i <= rows; i++) // Loop for each row
        {
            for(int j = 1; j <= cols; j++) // Loop for each column
            {
                System.out.print("*"); // Print asterisk followed by space
            }
            System.out.println("*"); // Move to the next line after each row
        }
    }

}
