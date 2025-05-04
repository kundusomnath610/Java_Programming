package org.example.DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int [] array1 = {1, 2, 2, 1};
        int[] array2 = {2, 2};

        System.out.println("The intersection is: " + sectionArray(array1, array2));

    }

    public static ArrayList<Integer> sectionArray(int[] array1, int[] array2) {
        
        Arrays.sort(array1);
        Arrays.sort(array2);

        int i = 0, j = 0;

        ArrayList<Integer> result = new ArrayList<>();

        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                result.add(array1[i]);

                while (i < array1.length - 1 && array1[i] == array1[i + 1]) {
                    i++;
                }

                while (j < array2.length - 1 && array2[j] == array2[j + 1]) {
                    j++;
                }

                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return result;
    }
        
}
