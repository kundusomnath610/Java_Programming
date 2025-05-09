package org.example.DSA;

import java.util.HashSet;

public class Hashing {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();

        set.add(25);
        set.add(33);
        set.add(11);
        set.add(11);
        set.add("Code");
        set.add("Java");

        System.out.println(set.size());
    }
}
