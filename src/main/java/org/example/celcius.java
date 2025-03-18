package org.example;

import java.util.Scanner;

public class celcius {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value:-");
        double far = scn.nextDouble();
        double cel = (far - 32) * 5 / 9;
        System.out.println("The value of cel is " + cel);
        scn.close();
    }
}
