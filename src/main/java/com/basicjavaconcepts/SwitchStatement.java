package com.basicjavaconcepts;


/* This program demonstrates the use of a switch statement to determine the name of a day based on its number. */
public class SwitchStatement {

    public static void main(String[] args) {

        int day = 1;

        String dayName;

        switch (day) {

            case 1:

                dayName = "Monday";
                break;

            case 2:

                dayName = "Tuesday";
                break;

            case 3:

                dayName = "Wednesday";
                break;

            case 4:

                dayName = "Thursday";
                break;

            case 5:

                dayName = "Friday";
                break;

            case 6:

                dayName = "Saturday";
                break;

            case 7:

                dayName = "Sunday";
                break;

            default:

                dayName = "Invalid day";
                break;
        }
        System.out.println("Day " + day + " is " + dayName);
    }
}
