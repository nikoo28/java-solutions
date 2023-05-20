package leetcode.medium;

import util.TreeNode;

public class MaximumBinaryTree {

  TreeNode constructMaximumBinaryTree(int[] nums) {
    if (nums == null)
      return null;
    return build(nums, 0, nums.length - 1);
  }

  private TreeNode build(int[] nums, int start, int end) {
    if (start > end) return null;

    // Identify max index
    int idxMax = start;
    for (int i = start + 1; i <= end; i++)
      if (nums[i] > nums[idxMax])
        idxMax = i;

    // Create a root
    TreeNode root = new TreeNode(nums[idxMax]);

    // Assign left and right children
    root.left = build(nums, start, idxMax - 1);
    root.right = build(nums, idxMax + 1, end);

    return root;
  }

}
