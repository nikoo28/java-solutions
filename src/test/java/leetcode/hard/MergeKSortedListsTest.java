package leetcode.hard;

import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedListsTest {

  private final MergeKSortedLists mergeKSortedLists;

  MergeKSortedListsTest() {
    mergeKSortedLists = new MergeKSortedLists();
  }

  @Test
  void testMergeKLists1() {
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(5);

    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

    ListNode l3 = new ListNode(2);
    l3.next = new ListNode(6);

    ListNode[] lists = new ListNode[]{l1, l2, l3};
    ListNode listNode = mergeKSortedLists.mergeKLists(lists);

    assertEquals(1, listNode.val);
    assertEquals(1, listNode.next.val);
    assertEquals(2, listNode.next.next.val);
    assertEquals(3, listNode.next.next.next.val);
    assertEquals(4, listNode.next.next.next.next.val);
    assertEquals(4, listNode.next.next.next.next.next.val);
    assertEquals(5, listNode.next.next.next.next.next.next.val);
    assertEquals(6, listNode.next.next.next.next.next.next.next.val);
  }

  @Test
  void testMergeKLists2() {
    ListNode listNode = mergeKSortedLists.mergeKLists(new ListNode[0]);
    assertNull(listNode);
  }
}