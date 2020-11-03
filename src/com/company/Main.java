package com.company;

public class Main {


    public static void main(String[] args) {
        RemoveDuplicatesfromSortedList removes = new RemoveDuplicatesfromSortedList();

        ListNode2 head = new ListNode2(1);
        head.next = new ListNode2(1);
        head.next.next = new ListNode2(1);
//        head.next.next.next = new ListNode2(3);
//        head.next.next.next.next = new ListNode2(3);

        removes.deleteDuplicates(head);


    }
}


