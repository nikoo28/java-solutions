package leetcode;

import util.ListNode;

/**
 * Created by nikoo28 on 7/10/19 12:21 AM
 */

class MergeTwoSortedLists {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    if (l1 == null)
      return l2;

    if (l2 == null)
      return l1;

    ListNode pointer;
    ListNode answer;

    if(l1.val < l2.val) {
      answer = new ListNode(l1.val);
      l1 = l1.next;
    } else {
      answer = new ListNode(l2.val);
      l2 = l2.next;
    }
    pointer = answer;

    while (l1 != null && l2 != null) {

      if (l1.val < l2.val) {
        pointer.next = new ListNode(l1.val);
        l1 = l1.next;
      } else {
        pointer.next = new ListNode(l2.val);
        l2 = l2.next;
      }
      pointer = pointer.next;
    }

    pointer.next = l1 == null ? l2 : l1;

    return answer;
  }

}
