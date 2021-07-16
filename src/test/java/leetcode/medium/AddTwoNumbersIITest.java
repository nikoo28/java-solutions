package leetcode.medium;

import util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 10/11/19 12:44 AM
 */

class AddTwoNumbersIITest {

  private AddTwoNumbersII addTwoNumbersII = new AddTwoNumbersII();

  @Test
  void testAddTwoNumbers() {
    ListNode l1 = new ListNode(7);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);
    l1.next.next.next = new ListNode(3);

    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);

    ListNode result = addTwoNumbersII.addTwoNumbers(l1, l2);

    assertEquals(7, result.val);
    assertEquals(8, result.next.val);
    assertEquals(0, result.next.next.val);
    assertEquals(7, result.next.next.next.val);
    assertNull(result.next.next.next.next);
  }
}