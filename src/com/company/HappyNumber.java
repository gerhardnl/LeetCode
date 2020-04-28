package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        ArrayList<Integer> seperated = new ArrayList();

            while (n != 1) {
                if (!seen.contains(n)) {
                    seen.add(n);
                    seperated.clear();
                    while (n != 0) {
                        seperated.add(n % 10);
                        n = n / 10;
                    }
                    for (int i = 0; i < seperated.size(); i++) {
                        n = n + (seperated.get(i) * seperated.get(i));
                    }
                }else return false;
            }
        System.out.println("is happy");
        return true;
    }
    public boolean isHappycheat(int n) {
        Set<Integer> seen = new HashSet<>();
        while (!seen.contains(n)) {
            seen.add(n);
            int newNum = convert(n);
            if (newNum == 1) {
                return true;
            }
            n = newNum;
        }
        return false;
    }

    public int convert(int n) {
        int newNum = 0;
        while (n > 0) {
            int digit = n % 10;
            newNum += digit * digit;
            n /= 10;
        }
        return newNum;
    }
}
