package com.company;

import java.util.ArrayList;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        ArrayList<Character> title = new ArrayList<>();


        while (n >= 1){
            double remeinder = ((n % 26) == 0) ? 26 : n % 26;
            n = n / 26;
            title.add(0, (Character.valueOf((char)((remeinder) + 64))));
        }
        return title.toString().replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
    }
}
