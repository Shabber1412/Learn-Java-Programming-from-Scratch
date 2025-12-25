package com.basicjavaconcepts;

public class ArithmeticOperators {

    public static void main(String[] args)
    {
        int a = 58;
        int b = 29;
        int c = 15;
        int d = 10;
        int e = 5;

        // Addition
        int sum = a + b + c;
        System.out.println("Addition of A,B,C: " + sum);

        // Subtraction
        int difference = a - b - c;
        System.out.println("Subtraction of A,B,C: " + difference);

        // Multiplication
        int product = a * b * c;
        System.out.println("Multiplication of A,B,C: " + product);

        // Division
        int quotient = (d * e) / (d - e);
        System.out.println("Division of D and E: " + quotient);

        // Modulus
        int remainder = a % b;
        System.out.println("Modulus of A and B: " + remainder);

    }
    
}
