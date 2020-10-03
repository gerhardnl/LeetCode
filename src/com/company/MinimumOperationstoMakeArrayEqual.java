package com.company;

public class MinimumOperationstoMakeArrayEqual {
    public int minOperations(int n) {
        if (n == 0) return 0;
        int result = 0;
        if (n % 2 == 0){
            n = n/2;
            result = (int)Math.pow(n,2);
        }else {
            n = (n/2)+1;
            result = (n-1)*n;
        }
        return result;
    }
}
