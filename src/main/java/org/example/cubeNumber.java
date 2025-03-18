package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class cubeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scn.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = number * number * number;
        }
        System.out.println("The cube is " + number + " : " + sum);
    }
}
