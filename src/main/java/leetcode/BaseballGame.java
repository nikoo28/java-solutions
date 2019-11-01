package leetcode;

import java.util.Stack;

/**
 * Created by nikoo28 on 12/16/17 4:30 PM
 */

class BaseballGame {

  public int calPoints(String[] ops) {

    Stack<Integer> scoreStack = new Stack<>();

    int sum = 0;

    for (String op : ops) {

      if (op.equals("C")) {
        int cancelledScore = scoreStack.pop();
        sum -= cancelledScore;
        continue;
      }

      if (op.equals("D")) {
        int oldScore = scoreStack.peek();
        sum += (oldScore * 2);
        scoreStack.push(oldScore * 2);
        continue;
      }

      if (op.equals("+")) {
        int num1 = scoreStack.get(scoreStack.size() - 1);
        int num2 = scoreStack.get(scoreStack.size() - 2);
        int total = num1 + num2;
        scoreStack.push(total);
        sum += total;
        continue;
      }

      scoreStack.push(Integer.parseInt(op));
      sum += Integer.parseInt(op);
    }

    return sum;
  }
}
