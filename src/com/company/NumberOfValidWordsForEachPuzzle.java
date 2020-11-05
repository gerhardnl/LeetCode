package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class NumberOfValidWordsForEachPuzzle {
    // Time Limit Exceeded! Slow!!
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < puzzles.length; i++) {
            list.add(howManyWordsFit(words, puzzles[i]));
        }
        return list;
    }

    public Boolean isFirstLetterEqual(String word, String puzzle) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == puzzle.charAt(0)) return true;
        }
        return false;
    }

    public int howManyWordsFit(String[] words, String puzzle) {
        int result = 0;
        boolean isMatche = true;

        HashSet set = new HashSet<Character>();
        for (int i = 0; i < puzzle.length(); i++) {
            set.add(puzzle.charAt(i));
        }
        for (int i = 0; i < words.length; i++) {
            if (isFirstLetterEqual(words[i], puzzle)) {
                for (int j = 0; j < words[i].length(); j++) {
                    if (!set.contains(words[i].charAt(j))) {
                        isMatche = false;
                        break;
                    }
                }
            } else {
                isMatche = false;
            }
            if (isMatche) result++;
            isMatche = true;
        }
        return result;
    }
}
