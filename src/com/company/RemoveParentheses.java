package com.company;

public class RemoveParentheses {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();

        int counter = 0;

        for (char c : S.toCharArray()) {
            if (c == '(' && counter++ > 0) sb.append(c);
            if (c == ')' && counter-- > 1) sb.append(c);
        }
        return sb.toString();
    }
}
