package com.company;

import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = -1;

        for (int i = 0; i < nums.length; i++) {
            if (list.isEmpty() || list.get(count) < nums[i]) {
                list.add(nums[i]);
                count++;
                nums[count] = list.get(list.size() - 1);
            }
        }
        return list.size();

    }

}
