package org.example.ExceptionHandeling;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) throws EligibilityException {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Branch");
        String branch = scn.next();
        System.out.println("Please enter a marks");
        int mark = scn.nextInt();

        if (branch.equals("cse") && mark >= 80) {
            System.out.println("Congrats you are eligible!!!");
        } else {
            if (branch.equals("cse") == false) 
                throw new EligibilityException("Only CSE allowed!!!");
            if (mark < 80) 
                throw new EligibilityException("Your marks lower then 80 percent"); 

        }

    }
}

    class EligibilityException extends Exception {
        public EligibilityException(String msg) {
            super(msg);
        }
    }
