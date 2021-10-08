package leetcode;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author nikoo28 on 9/10/17
 */
class AverageOfLevelsInBinaryTree {

  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> result = new ArrayList<>();
    Queue<TreeNode> q = new LinkedList<>();

    if (root == null) return result;
    q.add(root);
    while (!q.isEmpty()) {
      int n = q.size();
      double sum = 0.0;
      for (int i = 0; i < n; i++) {
        TreeNode node = q.poll();
        sum += node.val;
        if (node.left != null) q.offer(node.left);
        if (node.right != null) q.offer(node.right);
      }
      result.add(sum / n);
    }
    return result;
  }

}
