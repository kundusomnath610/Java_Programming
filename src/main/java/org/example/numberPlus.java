package org.example;

import java.util.Scanner;

public class numberPlus {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int temp = Math.abs(number);
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("The number is: " + sum);
    }
}
