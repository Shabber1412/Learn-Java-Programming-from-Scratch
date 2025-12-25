package com.functionsConcept;

import java.util.Scanner;

public class MultiplyTwoNumbers {


    public static int CalculateProduct(int a, int b)
    {
        return a * b;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Multiplication of Two Numbers: " + CalculateProduct(a, b));
        sc.close();
    }




}
