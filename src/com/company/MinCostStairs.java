package com.company;

public class MinCostStairs {
    public int minCostClimbingStairs(int[] cost) {
        int result = 0;
        int position = -1;

        while (position < cost.length - 2) {
            if (cost[position + 1] == 0) {
                position++;
                result += cost[position];
            } else if (cost[position + 1] + 1 >= cost[position + 2] && position + 3 > cost.length || cost[position + 2] == 0) {
                position += 2;
                result += cost[position];
            } else {
                position++;
                result += cost[position];
            }
        }
        return result;
    }
}
