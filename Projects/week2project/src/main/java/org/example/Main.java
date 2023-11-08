package org.example;

import javax.swing.*;
import java.util.Scanner;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to Velesnic Public Library. ");
        Scanner scanner = new Scanner(System.in);

        Book[] bookArray = new Book[22];

        bookArray[0] = new Book(11111, "00-001", "The Demon King", false, "");
        bookArray[1] = new Book(11112, "00-002", "The Secrets of the Universe", false, "");
        bookArray[2] = new Book(11113, "00-003", "Biography of Jonathan Hop", false, "");
        bookArray[3] = new Book(11114, "00-004", "How to get away with Murder", false, "");
        bookArray[4] = new Book(11115, "00-005", "Why Leslie Deserves a 100 on Her Project", false, "");
        bookArray[5] = new Book(11116, "00-006", "The Art of Procrastination: A Complete Guide", false, "");
        bookArray[6] = new Book(11117, "00-007", "The Ultimate Guide to Overthinking Everything", false, "");
        bookArray[7] = new Book(11118, "10-000", "The Experts Guide to Making Simple Things Complicated", false, "");
        bookArray[8] = new Book(11119, "10-001", "How to Stop Being Toxic", false, "");
        bookArray[9] = new Book(11120, "10-002", "101 Excuses for Every Occasion", false, "");
        bookArray[10] = new Book(11121, "10-003", "Why I Should Be a Millionaire", false, "");
        bookArray[11] = new Book(11122, "10-004", "The Art of Napping: A Comprehensive Study", false, "");
        bookArray[12] = new Book(11123, "10-005", "How to Rob a Bank", false, "");
        bookArray[13] = new Book(11124, "10-006", "Why Men Deserve Nothing", false, "");
        bookArray[14] = new Book(11125, "10-007", "Why Do Dallas Residents Drive so Bad: A Study", false, "");
        bookArray[15] = new Book(11126, "10-008", "Biography of Bad Bunny", false, "");
        bookArray[16] = new Book(11127, "10-009", "List of the Best TV Shows Ever", false, "");
        bookArray[17] = new Book(11128, "11-000", "List of the Best Movies Ever", false, "");
        bookArray[18] = new Book(11129, "11-001", "The Fault in Our Starships", false, "");
        bookArray[19] = new Book(11130, "11-002", "Java Introduction, Tips, and Tricks", false, "");
        bookArray[20] = new Book(11131, "11-003", "Why does Everyone Keep Moving to Texas: Please Stop, It's too Crowded", false, "");
        bookArray[21] = new Book(11132, "11-004", "My Fingers Hurt From Typing So Much: Based on a True Story", false, "");


        boolean isRunning = true;
        while (isRunning) {
            displayMainMenu();


            int homeScreenOption = Integer.parseInt(scanner.nextLine());

            switch (homeScreenOption) {
                case 1:
                    handleAvailableBooks(bookArray);
                    break;

                case 2:
                    handleCheckedOutBooks(bookArray);
                    break;


                case 3:
                    System.out.println("You are now exiting the library.");
                    System.exit(0);
                    break;
                default:

                    System.out.println("Please enter a valid option. ");
                    break;

        }
         }

        }





//methods
    public static void displayAvailableBooks(Book[] bookArray) { //do not touch anymore
            System.out.println("These are the available books:");
            for (Book book : bookArray) {
                if (book != null && !book.isBookIsCheckedOut()) {

                    System.out.println("Book ID: " + book.getBookId() + "   " +
                            " ISBN: " + book.getBookIsbn() + "   " +
                            " Title: " + book.getBookTitle() + "   ");
                }
            }

        }
    //do not touch anymore


public static void displayCheckedOutBooks(Book[] bookArray) {
    System.out.println("These are the books currently checked out:");
    for (Book book : bookArray) {
        if (book != null && book.isBookIsCheckedOut()) {
            System.out.println("Book ID: " + book.getBookId() + "   ");

            System.out.printf("ISBN: " + book.getBookIsbn() + "   ");

            System.out.printf("Title: " + book.getBookTitle() + "   ");

            System.out.printf("Checked Out To: " + book.getBookIsCheckedOutTo() + " ");
                }
          }
       }

public static void displayMainMenu() {
    System.out.println("Main Menu");
    System.out.println("What would you like to do? Please select a Number.");
    System.out.println("1) Show Available Books.");
    System.out.println("2) Show Checked Out Books.");
    System.out.println("3) Exit.");
}
public static void handleAvailableBooks (Book [] bookArray) {
        displayAvailableBooks(bookArray);
    System.out.println("What would you like to do? Please select an option.");
    System.out.println("1) Check Out Book. ");
    System.out.println("2) Return to Main Menu.");
    System.out.println("3) Exit Library.");
    Scanner scanner = new Scanner(System.in);
    int handleAvailableBooksOptionStr = scanner.nextInt();

    switch(handleAvailableBooksOptionStr) {
        case 1:

        System.out.println("Please enter your Username to continue.");
        String userName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter Book ID to check out.");
        String selectedBookNumberStr = scanner.nextLine();
        int selectedBookNumber = Integer.parseInt(selectedBookNumberStr);
        boolean bookFound = false;

        for (Book book : bookArray) {
            if (book != null && !book.isBookIsCheckedOut() && book.getBookId() == selectedBookNumber) {
                book.setBookIsCheckedOut(true);
                book.setBookIsCheckedOutTo(userName);
                System.out.println(book.getBookTitle() + " has been checked out by " + userName + ".");
                bookFound = true;
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Please enter a valid option.");
        }

        case 2:
            displayMainMenu();
            boolean isRunning = false;
            break;

        case 3:
            System.out.println("You are now exiting the Library.");
            System.exit(0);
            break;

        default:
            System.out.println("Please enter a valid input.");

    }
}

public static void handleCheckedOutBooks(Book[] bookArray) {
        displayCheckedOutBooks(bookArray);
        Scanner scanner = new Scanner(System.in);
    System.out.println("Please select an option.");
    System.out.println("C) Check in a Book.");
    System.out.println("X) Return to Main Menu.");
    System.out.println("E) Exit Library.");
    String displayCheckedOutBooksOptions = scanner.nextLine();
    switch (displayCheckedOutBooksOptions){
        case"C":
            for(Book book:bookArray){
                System.out.println("Please verify your Username to check book back in. ");
                String verifiedUserName=scanner.nextLine();
                scanner.nextLine();
                book.checkInBook();
                break;
        }
        break;
        case"X":
            System.out.println("You are now returning to the Main Menu.");
            displayMainMenu();
            boolean isRunning=false;
        break;
        case"E":
            System.out.println("You are now exiting the Library.");
            System.exit(0);
        break;
        default:
            System.out.println("Please enter a valid input.");
        }
        }
}