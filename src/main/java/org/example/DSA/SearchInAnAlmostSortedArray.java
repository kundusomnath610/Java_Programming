package org.example.DSA;

public class SearchInAnAlmostSortedArray {
    public static void main(String[] args) {
        
    }

    public static int almostSortedArray(int[] arr, int target) {
        // Binary search algorithm..

        int n = arr.length;

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;

            if (arr[mid - 1] == target) return mid - 1;
            if (arr[mid + 1] == target) return mid + 1;
        }
    }
}
