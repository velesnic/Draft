package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 45;
        intArray[1] = 73;
        intArray[2] = 79;
        intArray[3] = 972;
        intArray[4] = 12;

        Arrays.sort(intArray);
        for(int myArray : intArray) {
            System.out.println(myArray);
        }










    }
}