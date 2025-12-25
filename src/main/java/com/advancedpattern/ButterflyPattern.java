package com.advancedpattern;

public class ButterflyPattern {

    public static void main(String[] args) {
        int rows = 4; // Number of rows

        // Upper half of the butterfly
        for(int i = 1; i <= rows; i++) {
            // Left wing
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces between wings
            for(int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print("  ");
            }
            // Right wing
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }

        // Lower half of the butterfly
        for(int i = rows; i >= 1; i--) {
            // Left wing
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces between wings
            for(int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print("  ");
            }
            // Right wing
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
        

    }
}
