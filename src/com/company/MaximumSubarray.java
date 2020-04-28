package com.company;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int newSum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            newSum = Math.max(newSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, newSum);
        }
        return maxSum;
    }
}
