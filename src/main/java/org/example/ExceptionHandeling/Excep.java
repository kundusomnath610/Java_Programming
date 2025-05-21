package org.example.ExceptionHandeling;

import java.util.Scanner;

public class Excep {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.print("Enter a number:- ");
            int a = scn.nextInt();

            System.out.print("Enter a second number:- ");
            int b = scn.nextInt();

            int result = a / b;

            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println();
        }

        System.out.println("Program run Fine");
        scn.close();
    }
}
