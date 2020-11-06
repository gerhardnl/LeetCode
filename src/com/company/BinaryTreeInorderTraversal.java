package com.company;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode5 root) {
        if (root != null) {

            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }
        return list;
    }
}

class TreeNode4 {
    int val;
    TreeNode5 left;
    TreeNode5 right;

    TreeNode4() {
    }

    TreeNode4(int val) {
        this.val = val;
    }

    TreeNode4(int val, TreeNode5 left, TreeNode5 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
