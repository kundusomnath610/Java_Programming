package org.example;

import java.util.HashSet;

public class CheckDuplicate {
    public static void main(String[] args) {
        String str = "mac"; // should return false
        System.out.println(duplicateCharacter(str));
    }

    public static boolean duplicateCharacter(String str) {
        HashSet<Character> seen = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (seen.contains(ch)) {
                return true; // duplicate found
            }
            seen.add(ch);
        }
        return false; // no duplicates
    }
}