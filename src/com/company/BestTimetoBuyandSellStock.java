package com.company;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int ernings = 0;
        int leftPointer = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[leftPointer] > prices[i]) {
                leftPointer = i;
            } else if (ernings < prices[i] - prices[leftPointer]) {
                ernings = prices[i] - prices[leftPointer];
            }

        }
        System.out.println(ernings);
        return ernings;
    }
}
