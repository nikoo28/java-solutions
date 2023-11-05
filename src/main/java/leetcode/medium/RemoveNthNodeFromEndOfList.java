package leetcode.medium;

import util.ListNode;

public class RemoveNthNodeFromEndOfList {

  ListNode removeNthFromEnd(ListNode head, int n) {

    ListNode dummy = new ListNode(-1);
    dummy.next = head;

    ListNode firstPtr = dummy;
    ListNode secondPtr = dummy;

    // Move secondPtr n spaces ahead
    for (int i = 0; i < n; i++) {
      secondPtr = secondPtr.next;
    }

    // Move both now, until the next of secondPtr is null
    while(secondPtr.next != null) {
      firstPtr = firstPtr.next;
      secondPtr = secondPtr.next;
    }

    // We now have to remove the node next of firstPtr
    firstPtr.next = firstPtr.next.next;

    return dummy.next;
  }

}
