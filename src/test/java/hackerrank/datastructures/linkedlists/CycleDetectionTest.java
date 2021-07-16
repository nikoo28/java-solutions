package hackerrank.datastructures.linkedlists;

import util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 3/28/21 1:15 AM
 */

class CycleDetectionTest {

  private final CycleDetection cycleDetection;

  public CycleDetectionTest() {
    cycleDetection = new CycleDetection();
  }

  @Test
  void testHasCycle1() {
    ListNode head = new ListNode(1);

    assertFalse(cycleDetection.hasCycleHashSet(head));
    assertFalse(cycleDetection.hasCycleFloyd(head));
  }

  @Test
  void testHasCycle2() {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);

    head.next.next.next = head.next;

    assertTrue(cycleDetection.hasCycleHashSet(head));
    assertTrue(cycleDetection.hasCycleFloyd(head));
  }
}