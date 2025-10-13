package com.javaforbeginners;

public class Datatypeandvariables {
    /*    int age = 26;
    String name = "Shabber"; //Instance Variable
    double salary = 53000.00 ;
    static String company = "Capgemini";  //Static Variable
    String role = "Salesforce QA"; //Instance Variable

public void displayDetails(){
    int experience = 4;
    System.out.println(name + "-" + salary + "-" + age + "Years" + "-" + company + "-" + role + "-" + experience + "years" );
}
*/
    public static void main(String[] args) {
      //  Datatypeandvariables dtav = new Datatypeandvariables();
      //  dtav.displayDetails();

      //Primitive Data Types
        int totalOpportunities = 86546;
        double conversionRate = 87.8;
        boolean isActive = true;
        char grade = 'A';

        String testerName = "Shabber Hussain";
        int[] ids = {101, 102, 103, 104, 105};

        System.out.println("Tester Name" + testerName);
        System.out.println("Total opportunities" + totalOpportunities);
        System.out.println("Conversion Rate" + conversionRate + "%");
        System.out.println("Active: "+ isActive);
        System.out.println("Performance Grade: "+ grade);
        System.out.println("First Opportunity ID: "+ ids);

        // Below are all Primitive Data Type
        
        int i = 2;
        String s = "String";
        double d = 252.28;
        float f = 1354f;
        boolean b = true;
        char c = 'c';
        long l = 1564645231;

        System.out.println(i);
        System.out.println(s);
        System.out.println(d);
        System.out.println(f);
        System.out.println(c);
        System.out.println(l);
        System.out.println(b);

    }
}
