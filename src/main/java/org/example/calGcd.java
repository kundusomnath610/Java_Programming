package org.example;

import java.util.Scanner;

public class calGcd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter First Number:- ");
        int number1 = scn.nextInt();
        System.out.print("Enter Second Number:- ");
        int number2 = scn.nextInt();

        System.out.println(calgcd(number1,number2));
        scn.close();
    }
 
    public static int calgcd (int a, int b) {

        while ((b % a) != 0) {
            int rem = b % a;
            b = a;
            a = rem;
        }
        return a;
    }
}
