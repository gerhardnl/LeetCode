package com.company;

import java.util.Stack;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode7 head) {
        if(head == null)
        {
            return true;
        }

        ListNode7 prev = null;
        ListNode7 slowPtr = head;
        ListNode7 fastPtr = head;

        while(fastPtr != null && fastPtr.next != null)
        {
            prev = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        if(fastPtr == slowPtr)
        {
            return true;
        }

        ListNode7 secondHead = null;
        if(fastPtr == null)
        {
            prev.next = null;
            secondHead = slowPtr;
        }
        else
        {
            prev.next = null;
            secondHead = slowPtr.next;
        }

        ListNode7 reverseHead = reverse(secondHead);
        boolean arePalindrome = compare(reverseHead, head);
        ListNode7 reverseAgain = reverse(secondHead);
        prev.next = reverseAgain;
        return arePalindrome;

    }
    boolean compare(ListNode7 head1, ListNode7 head2)
    {
        ListNode7 curr1 = head1;
        ListNode7 curr2 = head2;

        while(curr1 != null && curr2 != null)
        {
            if(curr1.val != curr2.val)
            {
                return false;
            }

            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        return true;
    }
    ListNode7 reverse(ListNode7 head)
    {
        ListNode7 previous = null;
        ListNode7 current = head;
        ListNode7 next = null;

        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}

class ListNode7 {
      int val;
      ListNode7 next;
      ListNode7() {}
      ListNode7(int val) { this.val = val; }
      ListNode7(int val, ListNode7 next) { this.val = val; this.next = next; }
  }
