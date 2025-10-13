package com.javaforbeginners;

public class WhileLoop {
    public static void main(String[] args) {
      
        int i = 1;

        while(i<=5){
            System.out.println("While loop is working fine! " + i);
            int j= 1;
            while (j<=3) {
                System.out.println("Nested While loop is working fine! " + j);
                j++;
            }
            i++;
        }
        System.out.println("I am Done with while loop! ");


    }

}
