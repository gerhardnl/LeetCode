package com.company;

import com.sun.source.tree.TreeVisitor;

import javax.swing.tree.TreeNode;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        MinimumOperationstoMakeArrayEqual n = new MinimumOperationstoMakeArrayEqual();
        System.out.println(n.minOperations(5));


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

