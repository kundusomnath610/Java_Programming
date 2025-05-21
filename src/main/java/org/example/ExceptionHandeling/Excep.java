package org.example.ExceptionHandeling;

import java.util.InputMismatchException;
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
            System.out.println("Exception Occure.. Please check the number");
        } catch (InputMismatchException ie) {
            System.out.println("Input does not matched!!!");
        }

        finally {
            System.out.println("Program run Fine");
        }

        scn.close();
    }
}
