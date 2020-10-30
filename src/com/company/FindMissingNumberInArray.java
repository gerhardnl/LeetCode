package com.company;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumberInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums.length < 1) return new ArrayList<>();
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] - 1] = 1;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) result.add(i + 1);
        }
        return result;
    }
}
