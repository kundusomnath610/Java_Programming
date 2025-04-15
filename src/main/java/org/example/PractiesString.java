package org.example;

public class PractiesString {
    public static void main(String[] args) {
        String str1 = "Kod";
        String str2 = new String("Apple");

        String str3 = "Kod";
        String str4 = new String("Apple");

        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));

        System.out.println(str2 == str4);
        System.out.println(str2.equals(str2));
    }
}
