package leetcode;

/**
 * Created by nikoo28 on 12/17/17 2:29 PM
 */

class RangeAddition2 {

  public int maxCount(int m, int n, int[][] ops) {
    if (ops == null || ops.length == 0) {
      return m * n;
    }

    int row = Integer.MAX_VALUE, col = Integer.MAX_VALUE;
    for(int[] op : ops) {
      row = Math.min(row, op[0]);
      col = Math.min(col, op[1]);
    }

    return row * col;
  }

}
