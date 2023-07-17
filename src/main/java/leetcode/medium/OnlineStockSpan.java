package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class OnlineStockSpan {

  List<Integer> list;

  public OnlineStockSpan() {
    this.list = new ArrayList<>();
  }

  public int next(int price) {
    list.add(price);
    int count = 0;
    for (int i = list.size() - 1; i >= 0; i--) {
      if (list.get(i) > price)
        break;
      count++;
    }
    return count;
  }

  public int[] calculateSpans(int[] prices) {

    int[] spans = new int[prices.length];
    spans[0] = 1; // Span of first element is always 1

    Stack<Integer> indexStack = new Stack<>();

    // Push the index of first element
    indexStack.push(0);

    for (int i = 1; i < prices.length; i++) {
      while (!indexStack.isEmpty()
          && prices[indexStack.peek()] < prices[i])
        indexStack.pop();

      // If index stack is empty, the price at index 'i'
      // is greater than all previous values
      if (indexStack.isEmpty())
        spans[i] = i + 1;
      else
        spans[i] = i - indexStack.peek();

      indexStack.push(i);
    }

    return spans;
  }

}
