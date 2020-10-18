package com.company;

import java.util.LinkedList;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int result = 1;
        int temp = 1;
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) == ')' && !list.isEmpty() && list.peek() == '(') {
                list.pop();
                temp++;
                result = Math.max(temp,result);
            }else{
                list.push(s.charAt(i));
                temp = 1;
            }
        }

        return result;
    }
}
