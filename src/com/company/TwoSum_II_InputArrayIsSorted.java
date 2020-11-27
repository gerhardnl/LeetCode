package com.company;

public class TwoSum_II_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        int frontPointer = numbers.length-1;
        int backPointer = 0;

        while (frontPointer > backPointer){
            if(numbers[backPointer] + numbers[frontPointer] < target){
                backPointer++;
            }
            else if(numbers[backPointer] + numbers[frontPointer] > target){
                frontPointer--;
            }else {
                result[0] = backPointer + 1;
                result[1] = frontPointer + 1;

                return result;
            }
        }
        return result;
    }
}
