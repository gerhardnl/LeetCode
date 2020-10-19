package com.company;

public class StringToInteger_atoi {
    public int myAtoi(String str) {
        int result = 0;
        boolean isPositive = true;
        try {
            str = str.trim();
            if (str.charAt(0) == '-' || Character.isDigit(str.charAt(0))) {

                if (str.charAt(0) == '-') isPositive = false;

                str = str.replaceAll("[^0-9-]", "");
            } else return 0;
            result = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            result = isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return result;

    }
}
