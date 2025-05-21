package org.example.ExceptionHandeling;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Branch");
        String branch = scn.next();
        System.out.println("Please enter a marks");
        int mark = scn.nextInt();
        
        if (branch.equals("cse") && mark >= 80) 
            System.out.println("Congrats you are eligible");
        else 
            if (branch.equals("cse") == false)
            throw new EligibilityException("Only CSE is allowed..");
    }

}
