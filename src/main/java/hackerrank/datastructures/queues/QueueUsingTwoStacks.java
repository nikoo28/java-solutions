package hackerrank.datastructures.queues;

import java.util.Stack;

/**
 * Created by nikoo28 on 12/26/20 5:58 PM
 */

public class QueueUsingTwoStacks {

  private Stack<Integer> input = new Stack();
  private Stack<Integer> output = new Stack();

  public void enqueue(int x) {
    input.push(x);
  }

  public int dequeue() {
    peek();
    return output.pop();
  }

  public int peek() {
    if (output.empty())
      while (!input.empty())
        output.push(input.pop());
    return output.peek();
  }

  public boolean isEmpty() {
    return input.empty() && output.empty();
  }

}
