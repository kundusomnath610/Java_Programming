package org.example;

public class CountVowel {
    public static void main(String[] args) {
        String s = "PROGRAMMING IS FUN";
        System.out.println("The vowel Found in string: " + vowel(s));
    }

    public static int vowel(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }
}
