package leetcode.easy;

import util.ListNode;

public class MiddleOfTheLinkedList {

  ListNode middleNode(ListNode head) {

    ListNode slowPtr = head;
    ListNode fastPtr = head;

    // Travel until the fast pointer reaches
    // the last node or null
    while (fastPtr != null && fastPtr.next!= null) {

      // Slow pointer moves 1 node
      slowPtr = slowPtr.next;

      // Fast pointer moves 2 nodes
      fastPtr = fastPtr.next.next;
    }

    return slowPtr;
  }

}
