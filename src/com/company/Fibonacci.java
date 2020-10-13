package com.company;

public class Fibonacci {
    //  int n1 = 1, n2 = 1, n3 = 0;

    public int fibonacciForLoop(int count) {
        int n1 = 0, n2 = 1, n3 = 0;
        for (int i = 1; i < count + 1; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    public void fibonacciUsingRecursion(int count) {
        int n1 = 1, n2 = 1, n3 = 0;
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            fibonacciUsingRecursion(count - 1);
        }
    }
}

