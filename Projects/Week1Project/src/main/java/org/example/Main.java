package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, which calculator would you like to use today?");
        System.out.println("MORTGAGE : Used to calculate out how much a monthly payment for a loan would be (minus insurance and taxes), as well as how much interest you would pay over the life of the loan.");
        System.out.println("COMPOUND INTEREST FUTURE- VALUE : Determines the future value of a one-time deposit assuming compound interest. ");
        System.out.println("PRESENT VALUE OF ANNUITY : Determines present value of ordinary annuity. ");
        System.out.println("Which calculator would you like to use today? ");
        System.out.println("Please enter either :");
        System.out.println("M (for mortgage calculator)");
        System.out.println("C (for compound interest calculator");
        System.out.println("A (for present annuity value");

        String userChoice = scanner.nextLine();
        userChoice = userChoice.toLowerCase();


        switch (userChoice) {
            case "m" :
            //this is for mortgage calculator

        System.out.println("Hello, welcome to the MORTGAGE PAYMENT calculator.");
        System.out.println("What is your Principal amount?");
        double principalAmount = scanner.nextDouble();

        System.out.println("What is your yearly interest rate?");
        scanner.nextLine();
        double annualInterestRate = scanner.nextDouble();

        System.out.println("What is the loan length in years?");
        scanner.nextLine();
        double loanLength = scanner.nextDouble();

        double monthlyInterestRate = (annualInterestRate / 12) / 100;
        double numberOfPayments = loanLength * 12;
        double monthlyPayment = principalAmount * (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments) / (Math.pow(1 + monthlyInterestRate, numberOfPayments - 1))));
        double totalInterest = (monthlyPayment * numberOfPayments);

        System.out.printf(" Monthly Payment : %.2f", monthlyPayment);
        System.out.printf("   Total Interest Paid : %.2f", totalInterest);

                break;


            case "c" :
            //this is for future value calculator

        System.out.println("Hello, welcome to the FUTURE VALUE OF DEPOSIT calculator.");
        System.out.println("What is your initial deposit amount?");
        double depositAmountTwo = scanner.nextDouble();

        System.out.println("What is your annual interest rate?");
        scanner.nextLine();
        double annualInterestRateTwo = scanner.nextDouble();

        System.out.println("How many years will you have it deposited?");
        scanner.nextLine();
        double numberOfYearsTwo = scanner.nextDouble();

        double dailyInterestRateTwo = annualInterestRateTwo / 365;
        double futureValueTwo = depositAmountTwo * Math.pow( 1 + (dailyInterestRateTwo / 365), 365 * numberOfYearsTwo);
        double totalInterestEarnedTwo = futureValueTwo - depositAmountTwo;

        System.out.printf("Future Value : $%.2f", futureValueTwo);
        System.out.printf("        Total Interest Earned : $%.2f", totalInterestEarnedTwo);
                break;

            case "a" :

            //this is the present value of annuity calculator
               System.out.println("Welcome to the PRESENT VALUE OF ANNUITY calculator.");
               System.out.println("What is the monthly payout amount?");
                double monthlyPayoutAmountThree = scanner.nextDouble();

                System.out.println("What is the expected annual interest rate?");
                 scanner.nextLine();
                 double annualInterestRateThree = scanner.nextDouble();

                 System.out.println("In how many years will the payout be?");
                 scanner.nextLine();
                 double numberOfYearsThree = scanner.nextDouble();

                 double monthlyInterestRateThree = ((annualInterestRateThree / 12) / 100);
                 double numberOfPaymentsThree = numberOfYearsThree * 12;
                 double presentValueThree = monthlyPayoutAmountThree * ((1 - (Math.pow((1 + monthlyInterestRateThree), -numberOfPaymentsThree))) / monthlyInterestRateThree);

            System.out.printf("Present Annuity Value : $%.2f", presentValueThree);

            break ;

        }

    }
}