package leetcode.medium;

import util.TreeNode;

public class HouseRobberIII {

  int rob(TreeNode root) {

    int[] options = travel(root);
    return Math.max(options[0], options[1]);
  }

  private int[] travel(TreeNode root) {
    // Base case. just return {0,0} as you cannot rob anything
    if (root == null)
      return new int[2];

    int[] left_node_choices = travel(root.left);
    int[] right_node_choices = travel(root.right);
    int[] options = new int[2];

    // Store value if looted in [0]
    options[0] = root.val + left_node_choices[1] + right_node_choices[1];

    // Store value if skipped in [1]
    options[1] = Math.max(left_node_choices[0], left_node_choices[1]) +
                  Math.max(right_node_choices[0], right_node_choices[1]);

    return options;
  }

}
