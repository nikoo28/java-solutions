package leetcode.easy;

import util.ListNode;

public class RemoveLinkedListElements {

  public ListNode removeElements(ListNode head, int val) {

    // Create a dummy head node
    ListNode dummy = new ListNode(-1);
    dummy.next = head;

    ListNode curr = dummy;
    while (curr.next != null) {

      // Check if the value matches
      if (curr.next.val == val)
        curr.next = curr.next.next;
      else
        curr = curr.next;
    }

    // Return the head
    return dummy.next;
  }

}
