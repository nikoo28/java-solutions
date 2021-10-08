package leetcode;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikoo28 on 9/22/18 7:28 PM
 */

class LeafSimilar {

  public boolean leafSimilar(TreeNode root1, TreeNode root2) {

    List<Integer> leafSequence1 = new ArrayList<>();
    List<Integer> leafSequence2 = new ArrayList<>();

    traverse(leafSequence1, root1);
    traverse(leafSequence2, root2);

    return leafSequence1.equals(leafSequence2);
  }

  private void traverse(List<Integer> leafSequence, TreeNode root) {

    if (root == null)
      return;

    if (root.left == null && root.right == null) {
      leafSequence.add(root.val);
      return;
    }

    traverse(leafSequence, root.left);
    traverse(leafSequence, root.right);
  }

}
