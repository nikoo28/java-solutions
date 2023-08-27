package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikoo28 on 10/16/19 2:51 AM
 */

class PascalsTriangle {

  List<List<Integer>> generate(int numRows) {

    List<List<Integer>> result = new ArrayList<>();

    if (numRows == 0) return result;

    List<Integer> firstRow = new ArrayList<>();
    firstRow.add(1);
    result.add(firstRow);

    if (numRows == 1) return result;

    for (int i = 1; i < numRows; i++) {
      List<Integer> prevRow = result.get(i - 1);

      // Start the next row
      ArrayList<Integer> row = new ArrayList<>();
      row.add(1);
      for (int j = 0; j < i - 1; j++) {
        row.add(prevRow.get(j) + prevRow.get(j + 1));
      }
      row.add(1);

      // Add this new row to final result
      result.add(row);
    }

    return result;
  }

}
