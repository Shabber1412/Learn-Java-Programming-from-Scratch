package com.advancedpattern;

public class SolidRhombus {

    public static void main(String[] args)
    {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= rows; k++) {
                System.out.print("*");           
            }
            System.out.println(); // Move to the next line after each row
        }
    }

}
