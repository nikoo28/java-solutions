package leetcode;

import util.ListNode;

/**
 * Created by nikoo28 on 12/17/17 10:40 PM
 */

class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {

    if (head == null || head.next == null)
      return head;

    ListNode prev = null;

    while (head.next != null) {

      ListNode temp = head.next;
      head.next = prev;
      prev = head;
      head = temp;
    }

    head.next = prev;
    return head;

  }

}
