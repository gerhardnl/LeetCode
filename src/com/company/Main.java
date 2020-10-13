package com.company;

import com.sun.source.tree.TreeVisitor;

import javax.swing.tree.TreeNode;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        LucasNumbers lucasNumbers = new LucasNumbers();
        System.out.println(lucasNumbers.lucas(10));
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
    public static List<String> generateParenthesis(int n) {
        String currentString = "";
        List list = new ArrayList();
        backTrack(list, currentString, 0, 0, n);
        return list;
    }
    public static String multiply(String num1, String num2) {
        BigInteger number = new BigInteger(num1);
        BigInteger result = number.multiply(new BigInteger(num2));


        return result.toString();
    }

}

