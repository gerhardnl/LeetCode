package com.company;

import java.util.ArrayList;
import java.util.List;


public class SubstringwithConcatenationofAllWords {
    static List<String> list = new ArrayList<>();

    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();
        List<String> allCombinations = possibleWords(words, 0);

        System.out.println(allCombinations);

        for (String combination : allCombinations) {
            if (s.contains(combination)) result.add(s.indexOf(combination));
        }

        return result;
    }

    public static List<String> possibleWords(String[] words, int index) {

        String combination = "";

        if (index == words.length) {
            for (int i = 0; i < words.length; i++) {
                combination += words[i];
            }
            list.add(combination);
        }

        for (int i = index; i < words.length; i++) {
            String temp = words[index];
            words[index] = words[i];
            words[i] = temp;

            possibleWords(words, index + 1);

            temp = words[index];
            words[index] = words[i];
            words[i] = temp;
        }

        return list;
    }
}
