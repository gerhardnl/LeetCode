package com.company;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static List<String> generateParenthesis(int n) {
        String currentString = "";
        List list = new ArrayList();
        backTrack(list, currentString, 0, 0, n);
        return list;
    }

    public static void backTrack(List<String> outputArr, String currentString, int open, int close, int max) {
        if (currentString.length() == max * 2) {
            outputArr.add(currentString);
            return;
        }
        if (open < max) {
            backTrack(outputArr, currentString + "(", open + 1, close, max);
        }
        if (close < open) {
            backTrack(outputArr, currentString + ")", open, close + 1, max);
        }
    }
}
