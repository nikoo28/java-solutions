package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikoo28 on 11/2/19 11:28 PM
 */

class GenerateParantheses {

  List<String> generateParenthesis(int n) {

    List<String> list = new ArrayList<>();
    backtrack(list, "", 0, 0, n);
    return list;
  }

  private void backtrack(List<String> list, String str, int open, int close, int max) {

    if (str.length() == max * 2) {
      list.add(str);
      return;
    }

    if (open < max)
      backtrack(list, str + "(", open + 1, close, max);
    if (close < open)
      backtrack(list, str + ")", open, close + 1, max);
  }

}
