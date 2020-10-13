package com.company;

import java.math.BigInteger;

public class MultiplyBigNumbers {
    public static String multiply(String num1, String num2) {
        BigInteger number = new BigInteger(num1);
        BigInteger result = number.multiply(new BigInteger(num2));


        return result.toString();
    }
}
