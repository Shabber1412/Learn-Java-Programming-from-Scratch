package com.basicjavaconcepts;

import java.util.*;

public class ScannerConcept 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Scanner object to read input
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt(); // Read first integer from user
        int b = scanner.nextInt(); // Read second integer from user
        

        int Addition = a + b ; // Addition of two numbers
        System.out.println("Addition of A and B: " + Addition);

        int Subtraction = a - b; // Subtraction of two numbers
        System.out.println("Subtraction of A and B: " + Subtraction);


        int Multiplication = a * b; //  Multiplication of two numbers
        System.out.println("Multiplication of A and B: " + Multiplication);


        int Division = a / b; // Division of two numbers
        System.out.println("Division of A and B: " + Division);

        int Modulus = a % b; // Modulus of two numbers
        System.out.println("Modulus of A and B: " + Modulus);
        
        scanner.close(); // Close the scanner

    }
}