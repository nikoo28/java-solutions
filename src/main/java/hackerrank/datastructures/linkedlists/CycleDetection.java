package hackerrank.datastructures.linkedlists;

import util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nikoo28 on 3/28/21 1:13 AM
 */

public class CycleDetection {

  public boolean hasCycleHashSet(ListNode head) {

    Set<ListNode> nodeSet = new HashSet<>();

    while (head != null) {
      // Check the node in the hashset
      // If found, then we have a loop
      if (nodeSet.contains(head))
        return true;

      // Else add the node to the hashset
      nodeSet.add(head);

      head = head.next;
    }

    return false;
  }

  public boolean hasCycleFloyd(ListNode head) {

    // Start a slow and fast pointer
    ListNode slowPtr = head;
    ListNode fastPtr = head;

    while (slowPtr != null
        && fastPtr != null
        && fastPtr.next != null) {

      // Advance both the pointers
      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next.next;

      // If they meet, means we found a loop
      if (slowPtr == fastPtr) {
        return true;
      }
    }

    return false;
  }

  private ListNode getIntersectNode(ListNode head) {
    ListNode tortoise = head;
    ListNode hare = head;

    // A fast pointer will either loop around a cycle
    // and meet the slow pointer or reach the `null` at
    // the end of a non-cyclic list.
    while (hare != null && hare.next != null) {
      tortoise = tortoise.next;
      hare = hare.next.next;
      if (tortoise == hare) {
        return tortoise;
      }
    }

    return null;
  }

  public ListNode detectCycleMergePoint(ListNode head) {
    if (head == null) {
      return null;
    }

    // If there is a cycle, the fast/slow pointers will intersect at some
    // node. Otherwise, there is no cycle, so we cannot find an entrance to
    // a cycle.
    ListNode intersect = getIntersectNode(head);
    if (intersect == null) {
      return null;
    }

    // To find the entrance to the cycle, we have two pointers traverse at
    // the same speed -- one from the front of the list, and the other from
    // the point of intersection.
    ListNode ptr1 = head;
    ListNode ptr2 = intersect;
    while (ptr1 != ptr2) {
      ptr1 = ptr1.next;
      ptr2 = ptr2.next;
    }

    return ptr1;

  }

}
