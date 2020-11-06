package com.company;

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode5 root) {
        if (root != null) {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left + 1, right + 1);
        }
        return 0;
    }
}

class TreeNode5 {
    int val;
    TreeNode5 left;
    TreeNode5 right;

    TreeNode5() {
    }

    TreeNode5(int val) {
        this.val = val;
    }

    TreeNode5(int val, TreeNode5 left, TreeNode5 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
