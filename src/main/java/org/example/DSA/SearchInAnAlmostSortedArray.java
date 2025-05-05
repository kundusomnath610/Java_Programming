package org.example.DSA;

public class SearchInAnAlmostSortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 3, 40, 50, 80, 70};
        System.out.println("The Array Index present in: " + almostSortedArray(arr, 3));
    }

    public static int almostSortedArray(int[] arr, int target) {
        // Binary search algorithm..

        int n = arr.length;
        
        int low = 0, high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                //just add this condition for just sorted
                if(mid - 1 >= 0 && arr[mid-1] == target) return mid - 1;
                low = mid+1;
            }else{
                if(mid + 1 < n && arr[mid+1] == target) return mid + 1;
                high = mid -1;
            }
        }
        return -1;
    }
}
