package org.example;

public class binarySearch {

    public static int binary(int [] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                    low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1, 4, 6, 7, 10, 20, 22};
        int target = 22;
        System.out.println(binary(arr, target));
    }
}

// Time complexity is O(logN)
//Space Complexity is O(1)..
