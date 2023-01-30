package leetcode.medium;

import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesInPairsTest {

  private final SwapNodesInPairs swapNodesInPairs;

  SwapNodesInPairsTest() {
    swapNodesInPairs = new SwapNodesInPairs();
  }

  @Test
  void testSwapPairs1() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    ListNode changedList = swapNodesInPairs.swapPairs(head);

    assertEquals(2, changedList.val);
    assertEquals(1, changedList.next.val);
    assertEquals(4, changedList.next.next.val);
    assertEquals(3, changedList.next.next.next.val);
    assertEquals(5, changedList.next.next.next.next.val);
  }

  @Test
  void testSwapPairs2() {
    ListNode head = new ListNode(1);

    ListNode changedList = swapNodesInPairs.swapPairs(head);

    assertEquals(1, changedList.val);
  }

  @Test
  void testSwapPairs3() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);

    ListNode changedList = swapNodesInPairs.swapPairs(head);

    assertEquals(2, changedList.val);
    assertEquals(1, changedList.next.val);
  }
}