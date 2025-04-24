package org.example;

public class Binary {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("The index number is: " + BinarySearch(numbers, 70));
    }

    public static int BinarySearch(int[] numbers, int numberToFind) {
        int low = 0;
        int high = numbers.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2; 

            int MiddleNumber = numbers[mid];

            if(numberToFind == MiddleNumber) {
                return mid;
            }
            if(numberToFind < MiddleNumber) {
                high =  mid - 1;
            }
            else {
                low =  mid + 1;
            }
        }
        return -1;
    }
}
