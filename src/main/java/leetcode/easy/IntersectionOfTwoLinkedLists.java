package leetcode.easy;

import util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nikoo28 on 2019-07-21 12:38
 */

class IntersectionOfTwoLinkedLists {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    if (headA == null) return headA;
    if (headB == null) return headB;

    Set<ListNode> nodeAddress = new HashSet<>();

    while (headA != null) {

      nodeAddress.add(headA);
      headA = headA.next;
    }

    ListNode result = null;

    while (headB != null) {
      if (nodeAddress.contains(headB))
        return headB;

      headB = headB.next;
    }

    return result;
  }

}
