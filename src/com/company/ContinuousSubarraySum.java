package com.company;

public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        for (int i = 0; i < nums.length - 1; i++) {
            int result = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                result += nums[j];
                if (result == k) return true;
            }
        }
        return false;
    }
}
