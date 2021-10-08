package leetcode;

import util.TreeNode;

/**
 * Created by nikoo28 on 12/17/17 3:01 AM
 */

class ConstructStringFromBinaryTree {

  private String tree2str(TreeNode t) {

    if (t == null)
      return "";

    String result = t.val + "";

    String left = tree2str(t.left);
    String right = tree2str(t.right);

    if (left.equals("") && right.equals("")) return result;
    if (left.equals("")) return result + "()" + "(" + right + ")";
    if (right.equals("")) return result + "(" + left + ")";
    return result + "(" + left + ")" + "(" + right + ")";

  }

}
