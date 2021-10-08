package leetcode;

import util.TreeNode;

/**
 * Created by nikoo28 on 9/23/18 12:57 PM
 */

class ConvertSortedArrayToBinarySearchTree {

  public TreeNode sortedArrayToBst(int[] nums) {

    if (nums.length == 0)
      return null;

    return helper(nums, 0, nums.length - 1);
  }

  private TreeNode helper(int[] nums, int low, int high) {
    if (low > high)
      return null;

    int mid = (low + high) / 2;
    TreeNode node = new TreeNode(mid);
    node.left = helper(nums, low, mid - 1);
    node.right = helper(nums, mid + 1, high);
    return node;
  }

}
