package com.company;

import java.util.HashMap;

public class RomantoInteger {
    public int romanToInt(String s) {
        int number = 0;


        if (s.contains("MM")) {
            number += 2000;
            s = s.replaceAll("MM", "");
        }
        if (s.contains("CM")) {
            number += 900;
            s = s.replaceAll("CM", "");
        }
        if (s.contains("M")) {
            number += 1000;
            s = s.replaceAll("M", "");
        }
        if (s.contains("DCCC")) {
            number += 800;
            s = s.replaceAll("DCCC", "");
        }
        if (s.contains("DCC")) {
            number += 700;
            s = s.replaceAll("DCC", "");
        }
        if (s.contains("DC")) {
            number += 600;
            s = s.replaceAll("DC", "");
        }
        if (s.contains("CD")) {
            number += 400;
            s = s.replaceAll("CD", "");
        }
        if (s.contains("D")) {
            number += 500;
            s = s.replaceAll("D", "");
        }

        if (s.contains("CCC")) {
            number += 300;
            s = s.replaceAll("CCC", "");
        }
        if (s.contains("CC")) {
            number += 200;
            s = s.replaceAll("CC", "");
        }
        if (s.contains("XC")) {
            number += 90;
            s = s.replaceAll("XC", "");
        }
        if (s.contains("C")) {
            number += 100;
            s = s.replaceAll("C", "");
        }

        if (s.contains("LXXX")) {
            number += 80;
            s = s.replaceAll("LXXX", "");
        }
        if (s.contains("LXX")) {
            number += 70;
            s = s.replaceAll("LXX", "");
        }
        if (s.contains("LX")) {
            number += 60;
            s = s.replaceAll("LX", "");
        }
        if (s.contains("XL")) {
            number += 40;
            s = s.replaceAll("XL", "");
        }
        if (s.contains("L")) {
            number += 50;
            s = s.replaceAll("L", "");
        }

        if (s.contains("XXX")) {
            number += 30;
            s = s.replaceAll("XXX", "");
        }
        if (s.contains("XX")) {
            number += 20;
            s = s.replaceAll("XX", "");
        }
        if (s.contains("IX")) {
            number += 9;
            s = s.replaceAll("IX", "");
        }
        if (s.contains("X")) {
            number += 10;
            s = s.replaceAll("X", "");
        }

        if (s.contains("VIII")) {
            number += 8;
            s = s.replaceAll("VIII", "");
        }
        if (s.contains("VII")) {
            number += 7;
            s = s.replaceAll("VII", "");
        }
        if (s.contains("VI")) {
            number += 6;
            s = s.replaceAll("VI", "");
        }
        if (s.contains("IV")) {
            number += 4;
            s = s.replaceAll("IV", "");
        }
        if (s.contains("V")) {
            number += 5;
            s = s.replaceAll("V", "");
        }
        if (s.contains("III")) {
            number += 3;
            s = s.replaceAll("III", "");
        }
        if (s.contains("II")) {
            number += 2;
            s = s.replaceAll("II", "");
        }
        if (s.contains("I")) {
            number += 1;
            s = s.replaceAll("I", "");
        }
        System.out.println(number);
        return number;

    }


    public int romanToIntCheat(String s) {

        int num = 0;

        // Store roman numerals
        HashMap<Character, Integer> map = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1 && (
                    ((s.charAt(i) == 'I' && (s.charAt(i + 1) == 'V') || (s.charAt(i + 1) == 'X'))) ||
                            (s.charAt(i) == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) ||
                            (s.charAt(i) == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C'))
            )) {

                num += (map.get(s.charAt(i + 1)) - map.get(s.charAt(i))); // Get the value of the roman numeral.
                i++;                                                      // To account for the next num subracted from.
            } else
                num += map.get(s.charAt(i));
        }
        System.out.println(num);

        return num;
    }
}
