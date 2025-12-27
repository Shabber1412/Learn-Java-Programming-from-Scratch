package com.javaprograms;
import java.util.*;


public class PrintVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Vowels in the given string: ");

        for(int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){

                    System.out.println(ch + " at index " + i);
                }
        }

        sc.close();

        System.out.println("Program ended.");
    }
}