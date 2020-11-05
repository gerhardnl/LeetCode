package com.company;

public class Main {


    public static void main(String[] args) {
        NumberOfValidWordsForEachPuzzle puzzle = new NumberOfValidWordsForEachPuzzle();
        String[] words = {"aaaa", "asas", "able", "ability", "actt", "actor", "access"};
        String[] puzzles = {"aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"};

        System.out.println(puzzle.findNumOfValidWords(words, puzzles));
    }
}


