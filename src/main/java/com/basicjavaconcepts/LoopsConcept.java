package com.basicjavaconcepts;

public class LoopsConcept {

    public static void main(String[] args) {
        
        // For Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");    
        int j = 0;
        while (j <= 15) {
            System.out.println("Iteration: " + j);
            j++;
        }


        // Do-While Loop
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k <= 20);
    }

}
