package org.example;

import java.util.HashSet;

/*
 * if a char is seen then it return true.
 * if a char is not seen then return false.
 * input = "banana" // return true
 * input = "Somnath" // return false.
 */
public class CheckDuplicate {
    public static void main(String[] args) {
        String str = "somnath";
        System.out.println(duplicte(str));
    }

    public static boolean duplicte(String str) {
        HashSet<Character> seen = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (seen.contains(ch)) {
                return true;
            }
            seen.add(ch);
        }
        return false;
    }
}