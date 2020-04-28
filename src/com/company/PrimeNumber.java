package com.company;
import java.lang.*;

public class PrimeNumber {
    public void primenumber(int x){
        int count = 0;
        for (int i = 1; i <=x ; i++) {
            if (x % i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println("Number is prime");
        }else {
            System.out.println("Number is NOT prime");
        }
    }
}
