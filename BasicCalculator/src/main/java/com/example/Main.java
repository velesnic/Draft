package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello! What is your name?");
        Scanner scanner = new Scanner(System.in);
        String yourName = scanner.nextLine();
        System.out.println("Awesome. Nice to meet you " + yourName );
        System.out.println("Welcome to my calculator.");


        System.out.println("Enter the first number:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double secondNumber = scanner.nextDouble();

        System.out.println("What function would you like to perform?");
        System.out.println("Add");
        System.out.println("Subtract");
        System.out.println("Multiply");
        System.out.println("Divide");

        scanner.nextLine();
        String functionUsed = scanner.nextLine();


            if (functionUsed.equalsIgnoreCase("Add")) {
                double answer = AddTwoNumbers(firstNumber, secondNumber);
                System.out.printf(" %.2f + %.2f = %.2f", firstNumber,secondNumber,answer);
            } else if (functionUsed.equalsIgnoreCase("Subtract")) {
                double answer = SubtractTwoNumbers(firstNumber, secondNumber);
                System.out.printf(" %.2f - %.2f = %.2f ",firstNumber, secondNumber, answer);
            } else if (functionUsed.equalsIgnoreCase("Multiply")) {
                double answer = MultiplyTwoNumbers(firstNumber, secondNumber);
                System.out.printf("%.2f * %.2f = %.2f ",firstNumber, secondNumber, answer);
            } else if (functionUsed.equalsIgnoreCase("Divide")) {
                double answer = DivideTwoNumbers(firstNumber, secondNumber);
                System.out.printf("%.2f / %.2f = %.2f  ",firstNumber, secondNumber, answer);
            }





    }

    public static double AddTwoNumbers(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
    public static double SubtractTwoNumbers(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
    public static double MultiplyTwoNumbers(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
    public static double DivideTwoNumbers(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

}
