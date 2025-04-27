package org.example;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequ {
    public static void main(String[] args) {
        String str = "abcdbad"; // a = 2, b = 2, d = 2, c = 1
        System.out.println(Frequencies(str));
    }

    public static int Frequencies(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character n : str.toCharArray()) {
            map.put(n, map.getOrDefault(n, 0) + 1);

        }
        System.out.println("Character Frequencies: ");
        for (Character ch : map.keySet()) {
            System.out.println(ch + ": " + map.get(ch));
        }
        return 0;
    }
}
