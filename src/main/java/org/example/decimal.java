package org.example;
import java.util.Scanner;

public class decimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int decimal = scn.nextInt();
        //String binary = Integer.toBinaryString(decimal);
        String res = "";
        while (decimal > 0) {
            int reminder = decimal % 2;
            res = reminder + res; // for avoid the reverse the string. instead of (res + reminder) we use (reminder + res)...
            decimal = decimal / 2;
        }
        System.out.println("The Binary Number is: " + res);
        scn.close();      
    }
}


//   int a = 045; // Octal Number
//        System.out.println(a);
//
//        int b = 0x45; // Hexa decimal number
//        System.out.println(b);
