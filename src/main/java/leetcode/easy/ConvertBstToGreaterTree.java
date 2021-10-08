package leetcode.easy;

import java.util.*;

import util.TreeNode;

/**
 * @author nikoo28 on 9/17/17
 */
class ConvertBstToGreaterTree {

  public TreeNode convertBST(TreeNode root) {

    if (root == null)
      return null;

    List<Integer> elements = new ArrayList<>();
    inorder(root, elements);
    Map<Integer, Integer> numSumMap = new HashMap<>();

    int sum = 0;
    for (int i = elements.size() - 1; i >= 0; i--) {
      sum += elements.get(i);
      numSumMap.put(elements.get(i), sum);
    }

    Deque<TreeNode> nodes = new LinkedList<>();
    nodes.add(root);

    while (!nodes.isEmpty()) {
      TreeNode poppedNode = nodes.pop();
      poppedNode.val = numSumMap.get(poppedNode.val);
      if (poppedNode.left != null)
        nodes.add(poppedNode.left);

      if (poppedNode.right != null)
        nodes.add(poppedNode.right);
    }

    return root;
  }

  private void inorder(TreeNode root, List<Integer> elements) {
    if (root == null)
      return;
    inorder(root.left, elements);
    elements.add(root.val);
    inorder(root.right, elements);
  }

}
