package leetcode;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nikoo28 on 9/17/17
 */
class TwoSumIV {

  public boolean findTarget(TreeNode root, int k) {

    List<Integer> elements = new ArrayList<>();
    inorder(root, elements);

    for (int i = 0, j = elements.size()-1; i <j ; ) {

      if (elements.get(i) + elements.get(j) == k)
        return true;

      if (elements.get(i) + elements.get(j) > k)
        j--;
      else
        i++;
    }

    return false;
    
  }

  private void inorder(TreeNode root, List<Integer> elements) {
    if (root == null)
      return;
    inorder(root.left, elements);
    elements.add(root.val);
    inorder(root.right, elements);
  }

}
