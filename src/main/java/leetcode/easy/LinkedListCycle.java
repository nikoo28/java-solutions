package leetcode.easy;

import util.ListNode;

/**
 * Created by nikoo28 on 2019-07-21 12:55
 */

class LinkedListCycle {

  public boolean hasCycle(ListNode head) {
    if (head == null || head.next == null)
      return false;
    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (slow == fast) {
        while (head != slow) {
          head = head.next;
          slow = slow.next;
        }
        return true;
      }
    }
    return false;
  }

}
