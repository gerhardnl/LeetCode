package com.company;

import java.util.List;

public class MaximumDepthofNAryTree {
    public int maxDepth(Node6 root) {
        if (root != null) {
            int depth = 0;
            for (Node6 node : root.children) {
                depth = Math.max(depth, maxDepth(node));
            }
            return depth + 1;
        }
        return 0;
    }
}

class Node6 {
    public int val;
    public List<Node6> children;

    public Node6() {
    }

    public Node6(int _val) {
        val = _val;
    }

    public Node6(int _val, List<Node6> _children) {
        val = _val;
        children = _children;
    }
};
