package com.example;

public class Main {
    public static void main(String[] args) {  //this line is always the start of a program, tells java when to start
        System.out.println("heyy") ; // "sout" is a shortcut, this line is used to print out anything

        String fullName= "Gigi" ; //String is used for letters and letters+ numbers
        String birthDate= "March 5, 2002" ;

        int ticketsSold = 1000 ; //int (integer) for whole numbers
        double productPrice = 10.99 ; //double for fractions

        System.out.println(2987 + 675223); //math :)

        double stadiumTicketsSold =4000;
        double ticketCost=4.99;
        double moneyIMade = stadiumTicketsSold * ticketCost;
        System.out.println(moneyIMade);  //math but input-able :)

        stadiumTicketsSold = 25; //change variable now without using double (java knows what the phrase means now)
        ticketCost = 8.99;
        moneyIMade = stadiumTicketsSold + ticketCost;
        System.out.println(moneyIMade);

        float itemPrice = 10.5f; //needs f letter at end for float, float is like double but cant use as many number spaces

        boolean isPremiumMember = true;
        boolean isGoldMember = false;  //boolean can only be true or false
            //examples of each below

        int ticketSales = 5000;
        double ticketPrice = 37.99;
        String nameofPlayers ="John, Nancy, Freddy, Tatie";
        boolean receivedPassingGrade= false;

        //example of math
        double studentHispanicDiversity = .50;
        int studentPopulation = 3000;
        double totalHispanicStudents= studentPopulation * studentHispanicDiversity;
        System.out.println(totalHispanicStudents);

        //example of math pt 2
        double numberOfTeachers =7;
        double totalNumberOfStudents = 100;
        double studentsPerTeacher= totalNumberOfStudents / numberOfTeachers;
        System.out.println(studentsPerTeacher);

        //example how to calculate credit card balance
        double statementBalance = 1798.23;
        double interestRate = .267;
        double amountPaid = 1376;
        double netBalance = statementBalance - amountPaid ;
        double totalBalance = netBalance * interestRate;
        System.out.println(totalBalance);

        //warm up october 4 :)
        String personName = "John Doe";
        int personAge = 25;
        double productPrice2= 19.99;
        float temperatureCelsius = 27.5f;
        boolean isLoggedIn = true;




    }
}
