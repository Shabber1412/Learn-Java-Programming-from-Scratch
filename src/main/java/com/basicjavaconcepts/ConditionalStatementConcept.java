package com.basicjavaconcepts;

import java.util.Scanner;

public class ConditionalStatementConcept {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //int age = scanner.nextInt();
        /* 
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        */

        /*
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        */
       if(a==b){
              System.out.println("A is equal to B");
       }else{
        if (a < b) {
            System.out.println("A is less than B"); 
            
        } else {
            System.out.println("A is greater than B");
        }
       }

        scanner.close();

    }

}
