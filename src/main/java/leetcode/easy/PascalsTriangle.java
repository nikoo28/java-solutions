package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikoo28 on 10/16/19 2:51 AM
 */

class PascalsTriangle {

  public List<List<Integer>> generate(int numRows) {

    List<List<Integer>> result = new ArrayList<>();

    if (numRows == 0) return result;

    List<Integer> row = new ArrayList<>();
    row.add(1);
    result.add(row);

    if (numRows == 1) return result;

    for (int i = 2; i <= numRows; i++) {
      List<Integer> prevList = result.get(i - 2);
      ArrayList<Integer> line = new ArrayList<>();

      line.add(1);
      for (int j = 0; j < i - 2; j++) {
        line.add(prevList.get(j) + prevList.get(j + 1));
      }
      line.add(1);

      result.add(line);
    }

    return result;
  }

}
