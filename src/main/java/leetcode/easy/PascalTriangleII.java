package leetcode.easy;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nikoo28 on 2019-07-21 15:27
 */

class PascalTriangleII {

  public List<Integer> getRow(int rowIndex) {
    Integer[] rowList = new Integer[rowIndex + 1];
    rowList[0] = 1;
    for (int i = 1; i < rowList.length; i++) {
      rowList[i] = (int) ((long) rowList[i - 1] * (rowIndex - (i - 1)) / (i));
    }
    return Arrays.asList(rowList);
  }

}
