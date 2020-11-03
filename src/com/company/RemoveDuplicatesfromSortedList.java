package com.company;

public class RemoveDuplicatesfromSortedList {
    public ListNode2 deleteDuplicates(ListNode2 head) {
        ListNode2 temp = head;
        while (head != null) {

            while (head.next != null && head.val == head.next.val) {
                head.next = head.next.next;
            }

            head = head.next;
        }
        return temp;
    }
}

class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2() {
    }

    ListNode2(int val) {
        this.val = val;
    }

    ListNode2(int val, ListNode2 next) {
        this.val = val;
        this.next = next;
    }
}
