package leetcode;

/**
 * Created by nikoo28 on 12/19/17 12:43 AM
 */

public class LinkedListCycleII {

  public ListNode detectCycle(ListNode head) {

    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (slow == fast) {
        while (head != slow) {
          head = head.next;
          slow = slow.next;
        }
        return slow;
      }
    }
    return null;
  }

}
