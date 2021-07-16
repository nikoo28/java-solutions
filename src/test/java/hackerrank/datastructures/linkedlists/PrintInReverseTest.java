package hackerrank.datastructures.linkedlists;

import util.ListNode;
import org.junit.jupiter.api.Test;

/**
 * Created by nikoo28 on 3/21/21 12:29 AM
 */

class PrintInReverseTest {

  private final PrintInReverse printInReverse;

  public PrintInReverseTest() {
    printInReverse = new PrintInReverse();
  }

  @Test
  void testReversePrintUsingStack() {

    ListNode head = new ListNode(4);
    head.next = new ListNode(8);
    head.next.next = new ListNode(15);
    head.next.next.next = new ListNode(16);

    printInReverse.reversePrintUsingStack(head);
  }

  @Test
  void testReversePrintUsingRecursion() {

    ListNode head = new ListNode(4);
    head.next = new ListNode(8);
    head.next.next = new ListNode(15);
    head.next.next.next = new ListNode(16);

    printInReverse.reversePrintUsingRecursion(head);
  }
}