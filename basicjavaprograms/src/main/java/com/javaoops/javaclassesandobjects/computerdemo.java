package com.javaoops.javaclassesandobjects;

// Example for Methods and Objects in Java

class Computer{

    public void playMusic(){
        System.out.println("Playing Music..");
    }

    public String getMeAPen(int cost){
        if (cost >=50) {
            return "Here is your pen of cost: "+cost;
        }
        return "Nothing for you";
    }
}

public class ComputerDemo {

    public static void main(String[] args) {
         
        Computer comp = new Computer();
        comp.playMusic();
        String pen = comp.getMeAPen(50);
        System.out.println(pen);
 
    }

}

