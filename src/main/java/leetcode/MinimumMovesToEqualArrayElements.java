package leetcode;

import java.util.stream.IntStream;

/**
 * Created by nikoo28 on 12/17/17 2:44 PM
 */

public class MinimumMovesToEqualArrayElements {

  public int minMoves(int[] nums) {
    return IntStream.of(nums).sum() - nums.length * IntStream.of(nums).min().getAsInt();
  }

}
