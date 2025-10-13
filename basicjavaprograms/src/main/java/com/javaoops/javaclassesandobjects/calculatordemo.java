package com.javaoops.javaclassesandobjects;

//Example for Class and Object

class Calculator{
    

    public int add(int num1, int num2){ 
        int sum = num1 + num2;
        return sum;
    }
    public int sub(int num1, int num2){
        int sub = num1 - num2;
        return sub;
    }
    public int mul(int num1, int num2){
        int mul = num1 * num2;
        return mul;
    }
    public int div(int num1, int num2){
        int div = num1 / num2;
        return div;
    }

}

public class Calculatordemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        Calculator calc = new Calculator();

        int result = calc.add(num1, num2);
        System.out.println("The sum is: " + result);

        int result1 = calc.sub(num1, num2);
        System.out.println("The sub is: " + result1);

        int result2 = calc.mul(num1, num2);
        System.out.println("The mul is: " + result2);   

        int result3 = calc.div(num1, num2);
        System.out.println("The div is: " + result3);       

    }
}
