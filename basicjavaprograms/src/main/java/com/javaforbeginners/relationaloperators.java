package com.javaforbeginners;

public class relationaloperators {
    public static void main(String[] args) {
        
        int x = 6;
        int y = 9;
        int a = 7;
        int b = 4;

      //  boolean result =  x < y && a>b;
      //  boolean result2 = x > y || a < b;

      if (x > y && a>b) {
        System.out.println("Result");
      }else if (x < y || a < b ){
        System.out.println("Result 2");
      }else{
        System.out.println("Nothing to Print");
      } 
        
    }

}
