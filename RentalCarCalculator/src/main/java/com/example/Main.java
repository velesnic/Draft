package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double basicRate = 29.99;
        double optionsCost = 0;
        final double underageCharge = 29.99 * 0.3 ;
        double surcharge = 0;
        double totalCost =0 ;



        System.out.println("Hello, I am here to help you calculate the total cost of reserving a rental car.");
        System.out.println("First, when will you be renting out the vehicle?");
        Scanner scanner = new Scanner(System.in);

        String pickupDate = scanner.nextLine();

        System.out.println("Great, how many days will you be renting the vehicle?");
        int totalDays = scanner.nextInt();


        System.out.println("Would you like an electronic toll tag for an additional $3.95/day?");
        System.out.println("yes");
        System.out.println("no");
        scanner.nextLine();
        String tollTag = scanner.nextLine();

        if (tollTag.equalsIgnoreCase("yes")) {
            optionsCost = totalDays * 3.95;
            System.out.println("This rental will include an electronic toll tag.");
        }
        else if (tollTag.equalsIgnoreCase("no")) {

            System.out.println("This rental will not include an electronic toll tag.");
        }


        System.out.println("Would you like to include GPS for an additional $2.95/day?");
        String gps = scanner.nextLine();
        scanner.nextLine();

        if (gps.equalsIgnoreCase("yes")) {
            optionsCost = optionsCost + (totalDays * 2.95) ;
            System.out.println("This rental will include a GPS.");
        }
        else if (gps.equalsIgnoreCase("no")) {
            System.out.println("This rental will not include a GPS.");
        }

        System.out.println("Would you like to include roadside assistance coverage for an additional $3.95/day?");
        String roadside = scanner.nextLine();
        scanner.nextLine();

        if (roadside.equalsIgnoreCase("yes")) {
            optionsCost = optionsCost + (totalDays * 3.95);
            System.out.println("This rental will include roadside assistance.");
        }
        else if (roadside.equalsIgnoreCase("no")) {
            System.out.println("This vehicle will not include roadside assistance.");
        }

        double basicRental = 29.99 * totalDays;


        System.out.println("Finally, how old are you?");
        double age = scanner.nextInt();
        scanner.nextLine();

        if (age < 25) {
           totalCost = basicRental + optionsCost +underageCharge;
           surcharge = underageCharge;
        }
        else {
            totalCost = basicRental + optionsCost;
            surcharge = 0;
        }

        System.out.println("Basic Car Rental: $" + basicRental) ;
        System.out.println("Total Add-Ons Cost: $" + optionsCost);
        System.out.println("Underage driver surcharge : $" + underageCharge);
        System.out.println("Total : $" + totalCost );









    }

}



