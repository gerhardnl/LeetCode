package com.company;


public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        long x = n;
        return (x != 0 && ((x & (x - 1)) == 0));
    }
}
