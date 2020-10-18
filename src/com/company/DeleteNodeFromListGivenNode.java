package com.company;

public class DeleteNodeFromListGivenNode {

    public void deleteNode(ListNode node) {
        if (node.next.next == null){
            node.next = null;
            return;
        }

        node.val = node.next.val;

        deleteNode(node.next);
    }

}
  class ListNode1 {
      int val;
      ListNode next;
      ListNode1(int x) { val = x; }
  }

