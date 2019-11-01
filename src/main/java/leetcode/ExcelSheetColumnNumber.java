package leetcode;

/**
 * Created by nikoo28 on 12/17/17 2:40 PM
 */

class ExcelSheetColumnNumber {

  public int titleToNumber(String s) {

    int power = 0;
    char[] cell = s.toCharArray();
    int col = 0;
    for (int i = cell.length - 1; i >= 0; i--) {

      int factor = (int) Math.pow(26.0, power++);
      col += (factor * (cell[i] - 'A' + 1));
    }

    return col;
  }

}
