package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// fungerer ikke
public class SubstringwithConcatenationofAllWords {

    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> indexs = new ArrayList<>();

        indexs.add(search(s, permute(Arrays.asList(words),0)));

        return indexs;
    }

    public int search(String fullString, StringBuilder subbString){
        int indexOfSubbString = fullString.indexOf(String.valueOf(subbString));

        System.out.println(indexOfSubbString);
        return indexOfSubbString;
    }

        public static StringBuilder permute(java.util.List<String> arr, int k){
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = k; i < arr.size(); i++){
                java.util.Collections.swap(arr, i, k);
                permute(arr, k+1);
                java.util.Collections.swap(arr, k, i);
            }
            if (k == arr.size() -1){
                for (int i = 0; i < arr.size(); i++) {
                    stringBuilder.append(arr.get(i));

                }
                System.out.println(stringBuilder);
            }
            return stringBuilder;
        }
    }
