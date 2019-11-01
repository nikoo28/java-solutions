package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by nikoo28 on 9/22/18 6:15 PM
 */

class MovingAverage {

  private Queue<Integer> slidingWindow;
  private double previousSum = 0.0;
  private int limit;

  public MovingAverage(int size) {

    slidingWindow = new LinkedList<>();
    limit = size;
  }

  public double next(int val) {

    if (slidingWindow.size() == limit) {
      previousSum -= slidingWindow.poll();
    }

    previousSum += val;
    slidingWindow.add(val);

    return previousSum / slidingWindow.size();
  }

}
