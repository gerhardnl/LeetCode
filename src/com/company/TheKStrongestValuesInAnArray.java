package com.company;

import java.util.*;

public class TheKStrongestValuesInAnArray {
    public int[] getStrongest(int[] arr, int k) {
        int[] strongest = new int[k];
        int firstPointer = 0;
        int lastPointer = arr.length -1;
        Arrays.sort(arr);
        int median = arr[(arr.length -1) / 2];

        for (int i = 0; i <k ; i++) {
            if (Math.abs(arr[firstPointer] - median) <= Math.abs(arr[lastPointer] - median)){
                strongest[i] = arr[lastPointer];
                lastPointer--;
            }else {
                strongest[i] = arr[firstPointer];
                firstPointer++;
            }
        }
        return strongest;
    }
}
