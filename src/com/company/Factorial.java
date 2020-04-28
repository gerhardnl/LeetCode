package com.company;
public class Factorial {

    public static void factorial (int x) {

      int fact = 1;
        for (int i = 1; i <=x ; i++) {
            fact=fact*i;
            System.out.println(fact);
        }

    }
}
