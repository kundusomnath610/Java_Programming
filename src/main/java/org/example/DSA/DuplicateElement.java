package org.example.DSA;

//import java.util.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        System.out.println("The duplicate element is: " + findDuplicate(arr));
    }

    public static int findDuplicate (int[] arr) {
        int low = 0, high = arr.length - 1;
        int duplicate = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0; 

            for (int num : arr) {
                if (num <= mid) count++;
            }

            if (count > mid) {
                duplicate = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return duplicate;
    } 
}







/*
 * 
 * public static int duplicate(int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count = arr[i];
            }
        }
        return count;
    }
 * 
 * 
 * 
 * 
 */