package org.example;

public class linearSearch {
    public static int LinearSearch(int[] arr, int data) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 7, 10, 33};
        int data = 7;
        System.out.println(LinearSearch(arr, data));
    }
}
