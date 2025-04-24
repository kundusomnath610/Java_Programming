package org.example;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a array size:- ");
        int numbers = scn.nextInt();
        int[] array = new int[numbers];
        System.out.print("Please enter array element:- ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        System.out.print("Enter a number: ");

        int numberToFind = scn.nextInt();

        System.out.println("The number found in: " + BinarySearch(array, numberToFind));
        scn.close();
        
    }

    public static int BinarySearch(int[] numbers, int numberToFind) {
        
        int low = 0;
        int high = numbers.length - 1;
        

        while(low <= high) {
            int mid = low + (high - low) / 2; 

            int MiddleNumber = numbers[mid];

            if(numberToFind == MiddleNumber) {
                return mid;
            }
            if(numberToFind < MiddleNumber) {
                high =  mid - 1;
            }
            else {
                low =  mid + 1;
            }
        }
        return -1;
        
    }
}
