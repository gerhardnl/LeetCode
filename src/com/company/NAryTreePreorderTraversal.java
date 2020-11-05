package com.company;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePreorderTraversal {
    public ArrayList<Integer> list = new ArrayList<Integer>();

    public List<Integer> preorder(Node5 root) {
        if (root != null) {
            list.add(root.val);
            for (Node5 child : root.children) {
                preorder(child);
            }
        }
        return list;
    }
}

class Node5 {
    public int val;
    public List<Node5> children;

    public Node5() {
    }

    public Node5(int _val) {
        val = _val;
    }

    public Node5(int _val, List<Node5> _children) {
        val = _val;
        children = _children;
    }
}
