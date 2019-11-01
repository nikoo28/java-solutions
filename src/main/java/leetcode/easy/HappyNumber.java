package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nikoo28 on 10/19/19 3:11 PM
 */

class HappyNumber {

  public boolean isHappy(int n) {

    Set<Integer> inLoop = new HashSet<>();
    while (true) {
      int sum = 0;
      while (n != 0) {
        sum += Math.pow(n % 10, 2.0);
        n = n / 10;
      }

      if (sum == 1) return true;

      n = sum;
      if (inLoop.contains(n))
        return false;
      inLoop.add(n);
    }
  }

}
