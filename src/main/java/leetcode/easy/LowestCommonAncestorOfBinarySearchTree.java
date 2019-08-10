package leetcode.easy;

import leetcode.TreeNode;
/**
 * Created by nikoo28 on 12/19/17 12:58 AM
 */

public class LowestCommonAncestorOfBinarySearchTree {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

    if (root == null)
      return root;

    if (root.val > p.val && root.val > q.val)
      return lowestCommonAncestor(root.left, p, q);

    if (root.val < p.val && root.val < q.val)
      return lowestCommonAncestor(root.right, p, q);

    return root;
  }

}
