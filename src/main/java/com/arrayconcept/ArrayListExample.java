package com.arrayconcept;
import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args)
    {

        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("Volvo");
        arraylist.add("BMW");
        arraylist.add("Ford");


        System.out.println("Element at index 1: " + arraylist.get(1));
        System.out.println("Size of the ArrayList: " + arraylist.size());
    }

}
