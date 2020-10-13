package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CombinationSum {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        HashSet set = new HashSet();
        for (int i = 0; i < candidates.length; i++) {
            set.add(candidates[i]);
        }
        partition(target, target, "");
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                if (!set.contains(result.get(i).get(j))) {
                    result.remove(i);
                    i--;
                    break;
                }
            }
        }
        return result;
    }

    public void partition(int n, int max, String prefix) {

        if (n == 0) {
            List list = new ArrayList();
            for (int i = 0; i < prefix.length(); i++) {
                list.add(Integer.parseInt(String.valueOf(prefix.charAt(i))));
            }
            result.add(list);
            return;
        }

        for (int i = Math.min(max, n); i >= 1; i--) {
            partition(n - i, i, prefix + i);
        }
    }
}
