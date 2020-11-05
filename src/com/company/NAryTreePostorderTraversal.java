package com.company;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePostorderTraversal {

    public ArrayList<Integer> res = new ArrayList<Integer>();

    public List<Integer> postorder(Node3 root) {
        if (root != null) {
            for (Node3 node : root.children) {
                postorder(node);
            }
            res.add(root.val);
        }
        return res;
    }
}

class Node3 {
    public int val;
    public List<Node3> children;

    public Node3() {
    }

    public Node3(int _val) {
        val = _val;
    }

    public Node3(int _val, List<Node3> _children) {
        val = _val;
        children = _children;
    }
}
