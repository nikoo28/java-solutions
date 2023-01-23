package leetcode.medium;

import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

  private final AddTwoNumbers addTwoNumbers;

  AddTwoNumbersTest() {
    addTwoNumbers = new AddTwoNumbers();
  }

  @Test
  void testAddTwoNumbers1() {
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);

    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);

    ListNode result = new ListNode(7);
    result.next = new ListNode(0);
    result.next.next = new ListNode(8);

    ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);
    assertEquals(result.val, actual.val);
    assertEquals(result.next.val, actual.next.val);
    assertEquals(result.next.next.val, actual.next.next.val);
    assertEquals(result.next.next.next, actual.next.next.next);
  }

  @Test
  void testAddTwoNumbers2() {
    ListNode l1 = new ListNode(9);
    l1.next = new ListNode(9);
    l1.next.next = new ListNode(9);
    l1.next.next.next = new ListNode(9);
    l1.next.next.next.next = new ListNode(9);

    ListNode l2 = new ListNode(9);
    l2.next = new ListNode(9);
    l2.next.next = new ListNode(9);

    ListNode result = new ListNode(8);
    result.next = new ListNode(9);
    result.next.next = new ListNode(9);
    result.next.next.next = new ListNode(0);
    result.next.next.next.next = new ListNode(0);
    result.next.next.next.next.next = new ListNode(1);

    ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);
    assertEquals(result.val, actual.val);
    assertEquals(result.next.val, actual.next.val);
    assertEquals(result.next.next.val, actual.next.next.val);
    assertEquals(result.next.next.next.val, actual.next.next.next.val);
    assertEquals(result.next.next.next.next.val, actual.next.next.next.next.val);
    assertEquals(result.next.next.next.next.next.val, actual.next.next.next.next.next.val);
    assertEquals(result.next.next.next.next.next.next, actual.next.next.next.next.next.next);
  }
}