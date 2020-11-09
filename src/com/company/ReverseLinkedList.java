package com.company;

public class ReverseLinkedList {


    public ListNode4 reverseList(ListNode4 head) {

        for (int i = 0; i < 2; i++) {
            head = head.next;
        }

        ListNode4 prev = null;
        ListNode4 current = head;
        ListNode4 next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;

    }
}

class ListNode {
    int val;
    ListNode4 next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode4 next) {
        this.val = val;
        this.next = next;
    }
}
