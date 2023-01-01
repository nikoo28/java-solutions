package leetcode.medium;

import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenLinkedListTest {

  private final OddEvenLinkedList oddEvenLinkedList;

  OddEvenLinkedListTest() {
    oddEvenLinkedList = new OddEvenLinkedList();
  }

  @Test
  void testOddEvenList1() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    ListNode changedList = oddEvenLinkedList.oddEvenList(head);

    assertEquals(1, changedList.val);
    assertEquals(3, changedList.next.val);
    assertEquals(5, changedList.next.next.val);
    assertEquals(2, changedList.next.next.next.val);
    assertEquals(4, changedList.next.next.next.next.val);
  }

  @Test
  void testOddEvenList2() {
    ListNode head = new ListNode(2);
    head.next = new ListNode(1);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(5);
    head.next.next.next.next = new ListNode(6);
    head.next.next.next.next.next = new ListNode(4);
    head.next.next.next.next.next.next = new ListNode(7);

    ListNode changedList = oddEvenLinkedList.oddEvenList(head);

    assertEquals(2, changedList.val);
    assertEquals(3, changedList.next.val);
    assertEquals(6, changedList.next.next.val);
    assertEquals(7, changedList.next.next.next.val);
    assertEquals(1, changedList.next.next.next.next.val);
    assertEquals(5, changedList.next.next.next.next.next.val);
    assertEquals(4, changedList.next.next.next.next.next.next.val);
  }
}