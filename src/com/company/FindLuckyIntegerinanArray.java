package com.company;

public class FindLuckyIntegerinanArray {
    public int findLucky(int[] arr) {
        int[] counts = new int[501];
        for (int num : arr)
            counts[num]++;
        for (int i = arr.length; i > 0; i--) {
            if (counts[i] == i)
                return i;
        }
        return -1;
    }
}
