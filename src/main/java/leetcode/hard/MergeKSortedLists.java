package leetcode.hard;

import util.ListNode;

/**
 * Created by nikoo28 on 7/10/19 2:21 AM
 */

class MergeKSortedLists {

  ListNode mergeKLists(ListNode[] lists) {
    if (lists == null || lists.length == 0) {
      return null;
    }
    return mergeKListsHelper(lists, 0, lists.length - 1);
  }

  private ListNode mergeKListsHelper(ListNode[] lists, int start, int end) {
    if (start == end) {
      return lists[start];
    }

    if (start + 1 == end) {
      return merge2Lists(lists[start], lists[end]);
    }

    int mid = start + (end - start) / 2;
    ListNode left = mergeKListsHelper(lists, start, mid);
    ListNode right = mergeKListsHelper(lists, mid + 1, end);
    return merge2Lists(left, right);
  }

  private ListNode merge2Lists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;

    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        curr.next = l1;
        l1 = l1.next;
      } else {
        curr.next = l2;
        l2 = l2.next;
      }
      curr = curr.next;
    }

    curr.next = (l1 != null) ? l1 : l2;

    return dummy.next;
  }

}
