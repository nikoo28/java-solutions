package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author nikoo28 on 9/10/17
 */
class DistributeCandies {

  public int distributeCandies(int[] candies) {

    Set<Integer> kinds = new HashSet<>();
    for (int candy : candies) {
      kinds.add(candy);
    }
    return Math.min(kinds.size(), candies.length / 2);
  }

}
