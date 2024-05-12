package leetcode.medium;

import util.ListNode;

public class ReorderList {

  void reorderList(ListNode head) {

    if (head == null || head.next == null) // base case
      return;

    // Find the middle of the list
    ListNode p1 = head;
    ListNode p2 = head;
    while (p2.next != null && p2.next.next != null) {
      p1 = p1.next;
      p2 = p2.next.next;
    }

    // Reverse the half after middle
    ListNode preMiddle = p1;
    ListNode preCurrent = p1.next;
    while (preCurrent.next != null) {
      ListNode current = preCurrent.next;
      preCurrent.next = current.next;
      current.next = preMiddle.next;
      preMiddle.next = current;
    }

    // Start reordering
    p1 = head;
    p2 = preMiddle.next;
    while (p1 != preMiddle) {
      preMiddle.next = p2.next;
      p2.next = p1.next;
      p1.next = p2;
      p1 = p2.next;
      p2 = preMiddle.next;
    }
  }

}
