package leetcode.medium;

import util.ListNode;

public class SwapNodesInPairs {

  ListNode swapPairs(ListNode head) {

    // Create a dummy node to ease things
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode point = dummy;

    // Ensure nodes we are swapping are not null
    while (point.next != null && point.next.next != null) {

      // Identify nodes to swap
      ListNode swap1 = point.next;
      ListNode swap2 = point.next.next;

      // Actually swap
      swap1.next = swap2.next;
      swap2.next = swap1;


      // Prepare for next
      point.next = swap2;
      point = swap1;
    }

    // Return the start node
    return dummy.next;
  }

}
