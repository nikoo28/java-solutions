package leetcode.easy;

import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedListTest {

  private final MiddleOfTheLinkedList middleOfTheLinkedList;

  MiddleOfTheLinkedListTest() {
    middleOfTheLinkedList = new MiddleOfTheLinkedList();
  }

  @Test
  void testMiddleNode1() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    ListNode actualMid = middleOfTheLinkedList.middleNode(head);
    ListNode expectedMid = head.next.next;

    assertEquals(expectedMid, actualMid);
  }

  @Test
  void testMiddleNode2() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);

    ListNode actualMid = middleOfTheLinkedList.middleNode(head);
    ListNode expectedMid = head.next.next.next;

    assertEquals(expectedMid, actualMid);
  }
}