package com.company;

import java.util.HashMap;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int bineri = 0;
        int power = 0;
        HashMap<Character, Integer> vales = new HashMap<>() {{
            put('A', 1);
            put('B', 2);
            put('C', 3);
            put('D', 4);
            put('E', 5);
            put('F', 6);
            put('G', 7);
            put('H', 8);
            put('I', 9);
            put('J', 10);
            put('K', 11);
            put('L', 12);
            put('M', 13);
            put('N', 14);
            put('O', 15);
            put('P', 16);
            put('Q', 17);
            put('R', 18);
            put('S', 19);
            put('T', 20);
            put('U', 21);
            put('V', 22);
            put('W', 23);
            put('X', 24);
            put('Y', 25);
            put('Z', 26);
        }};

        for (int i = s.length() - 1; i >= 0; i--) {
            bineri = bineri + vales.get(s.charAt(i)) * ((int) Math.pow(26, power++));

        }
        return bineri;

    }
}
