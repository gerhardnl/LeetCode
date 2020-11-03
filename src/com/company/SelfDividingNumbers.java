package com.company;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            boolean isSelfDivid = true;
            String number = String.valueOf(i);
            for (int j = 0; j < number.length(); j++) {
                if (number.charAt(j) == '0') {
                    isSelfDivid = false;
                    break;
                }
                if (Integer.parseInt(number) % Integer.parseInt(String.valueOf(number.charAt(j))) != 0) {
                    isSelfDivid = false;
                    break;
                }
            }
            if (isSelfDivid) list.add(i);
        }
        return list;
    }

    public List<Integer> selfDividingNumbers1(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (util(i))
                res.add(i);
        }
        return res;
    }

    public boolean util(int num) {
        int temp = num;
        while (temp != 0) {
            int rem = temp % 10;
            if (rem == 0 || num % rem != 0)
                return false;
            temp /= 10;
        }
        return true;
    }
}
