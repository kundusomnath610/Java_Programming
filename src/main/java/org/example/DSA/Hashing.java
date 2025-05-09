package org.example.DSA;

//import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashing {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet<>();

        set.add(25);
        set.add(33);
        set.add(11);
        set.add(11);
        set.add("Code");
        set.add("Java");

        System.out.println("The size element is: " + set);
    }
}
