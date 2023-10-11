package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone cp = new CellPhone ();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the serial number?");
        String userSerialNumber = scanner.nextLine();

        System.out.println("What model is the phone?");
        String userModel = scanner.nextLine();

        System.out.println("Who is the carrier?");
        String userCarrier = scanner.nextLine();

        System.out.println("What is the phone number?");
        String userPhoneNumber = scanner.nextLine();

        System.out.println("Who is the owner of the phone?");
        String newOwner = scanner.nextLine();

        System.out.println("Serial Number: " + userSerialNumber);
        System.out.println("Model: " + userModel);
        System.out.println("Carrier: " + userCarrier);
        System.out.println("Owner: " + newOwner);












    }
}
