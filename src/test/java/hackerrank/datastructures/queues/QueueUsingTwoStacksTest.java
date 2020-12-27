package hackerrank.datastructures.queues;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 12/26/20 6:02 PM
 */

class QueueUsingTwoStacksTest {

  @Test
  void testQueueUsingTwoStacks1() {
    Queue<Integer> actualQueue = new LinkedList<>();
    QueueUsingTwoStacks myQueue = new QueueUsingTwoStacks();

    myQueue.enqueue(4);
    myQueue.enqueue(8);
    myQueue.enqueue(15);

    actualQueue.add(4);
    actualQueue.add(8);
    actualQueue.add(15);

    int expected = actualQueue.poll();
    assertEquals(expected, myQueue.dequeue());

    myQueue.dequeue();
    myQueue.enqueue(16);

    actualQueue.poll();
    actualQueue.add(16);

    expected = actualQueue.peek();
    assertEquals(expected, myQueue.peek());
  }

}