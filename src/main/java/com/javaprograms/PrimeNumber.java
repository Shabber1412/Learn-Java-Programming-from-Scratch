package com.javaprograms;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) { // Main method
        Scanner scanner = new Scanner(System.in); // Scanner object to read input
        System.out.println("Enter a number: ");   

        int num = scanner.nextInt(); // Read an integer from user
       
        if(isPrime(num)){ // Call isPrime method to check if number is prime
            System.out.println(num + " is a Prime number.");

        }else{
            System.out.println(num + " is not a Prime number.");
        }
        scanner.close(); // Close the scanner

    }

    public static boolean isPrime(int num) // Method to check if a number is prime
    {
        for(int i = 2; i <= num / 2; i++) // Loop from 2 to num/2   
        {
            if(num % i == 0) // If num is divisible by i, it's not prime
            {
                return false; // Return false if not prime
            }
        }
        return true;  // Return true if prime
    }
}
