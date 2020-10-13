package com.company;

import java.util.ArrayList;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        ArrayList store = new ArrayList();
        int count = 0;
        while (x != 0) {
            store.add(x % 10);
            if (x < 0) {
                x = x / 10;
                x = x - (x * 2);
            } else
                x = x / 10;
        }
        count = store.size() - 1;
        for (int i = 0; i < (store.size() / 2); i++) {
            if (store.get(i) == store.get(count)) {
                count--;
            } else {
                System.out.println("is false");
                return false;
            }

        }
        System.out.println("is true");
        return true;
    }
}
