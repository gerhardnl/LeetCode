package com.company;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (leftPointer < rightPointer) {

            while (leftPointer < rightPointer && !Character.isLetterOrDigit(s.charAt(leftPointer))) {
                leftPointer++;
            }
            while (leftPointer < rightPointer && !Character.isLetterOrDigit(s.charAt(rightPointer))) {
                rightPointer--;
            }
            if (Character.toLowerCase(s.charAt(leftPointer++)) != Character.toLowerCase(s.charAt(rightPointer--))) {
                return false;
            }
        }
        return true;

    }

    public boolean raphael(String s) {
        String onlyLetters = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String firstHalf = onlyLetters.substring(0, onlyLetters.length() / 2);
        String secondHalf = onlyLetters.substring((onlyLetters.length() / 2) + (onlyLetters.length() % 2 == 0 ? 0 : 1));

        return firstHalf.equals(new StringBuilder(secondHalf).reverse().toString());
    }
}
