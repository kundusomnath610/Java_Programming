package org.example.DSA;

import java.util.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 8, 2, 6, 4, 8};
        System.out.println("The element is: " + duplicate(arr));
    }
    public static int duplicate(int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count = arr[i];
            }
        }
        return count;
    }
}

