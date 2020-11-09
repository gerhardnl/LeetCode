package com.company;

public class SortList {
    public ListNode4 sortList(ListNode4 head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode4 middle = getMiddle(head);
        ListNode4 nextofmiddle = middle.next;

        middle.next = null;

        ListNode4 left = sortList(head);

        ListNode4 right = sortList(nextofmiddle);

        ListNode4 sortedlist = sortedMerge(left, right);
        return sortedlist;
    }
    public ListNode4 getMiddle(ListNode4 head){
        if (head == null)
            return head;

        ListNode4 slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    ListNode4 sortedMerge(ListNode4 a, ListNode4 b){
        ListNode4 result = null;

        if (a == null)
            return b;
        if (b == null)
            return a;

        if (a.val <= b.val) {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }
}
 class ListNode4 {
      int val;
      ListNode4 next;
      ListNode4() {}
      ListNode4(int val) { this.val = val; }
      ListNode4(int val, ListNode4 next) { this.val = val; this.next = next; }
}
