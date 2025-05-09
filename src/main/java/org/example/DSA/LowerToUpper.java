package org.example.DSA;

public class LowerToUpper {
    public static void main(String[] args) {
        String str = "How are You"; // HoW ArE YoU
        System.out.println("The output is: " + upperCase(str));
    }

    public static String upperCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(i % 2 == 0) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }
        return result.toString();
    }
}
