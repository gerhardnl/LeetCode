package com.company;

import java.util.HashMap;

public class FindMaxWidthOfBinaryTree {
    int maxWidth1;
    HashMap<Integer, Integer> leftMostPositions;

    int getMaxWidth(TreeNode1 node) {
        int maxWidth = 0;
        int width;
        int h = height(node);
        int i;

        for (i = 1; i <= h; i++) {
            width = getWidth(node, i);
            if (width > maxWidth)
                maxWidth = width;
        }

        return maxWidth;
    }

    public int getWidth(TreeNode1 node, int level) {
        if (node == null) {
            return 0;
        }
        if (level == 1)
            return 1;
        else if (level > 1)
            return getWidth(node.left, level - 1)
                    + getWidth(node.right, level - 1);
        return 0;
    }

    public int height(TreeNode1 node) {
        if (node == null)
            return 0;
        else {
            int lHeight = height(node.left);
            int rHeight = height(node.right);

            return (lHeight > rHeight) ? (lHeight + 1)
                    : (rHeight + 1);
        }
    }

    public int WifthOfBineryTree(TreeNode1 root) {
        maxWidth1 = 0;
        leftMostPositions = new HashMap<>();
        getWidth1(root, 0, 0);
        return maxWidth1;
    }

    public void getWidth1(TreeNode1 root, int depth, int position) {
        if (root == null) return;
        leftMostPositions.computeIfAbsent(depth, x -> position);
        maxWidth1 = Math.max(maxWidth1, position - leftMostPositions.get(depth) + 1);
        getWidth1(root.left, depth + 1, position * 2);
        getWidth1(root.right, depth + 1, position * 2 + 1);
    }
}

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1() {
    }

    TreeNode1(int val) {
        this.val = val;
    }

    TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

