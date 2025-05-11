package org.example.DSA;

public class meanMedian {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6}; // 17
        System.out.println("The mean of array is: " + meanAndMedian(arr));
        System.out.println("The median of array is: " + median(arr));
    }

    public static int meanAndMedian(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static int median(int[] arr1) {
        int n = arr1.length; // 4 / 2 = 2
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (n % 2 != 0) { // odd number of element
                result = arr1[n / 2];
            } else {
                result = (int) (arr1[1] + arr1[2] / 2.0);
            }
        }
        return result;
    }
}
