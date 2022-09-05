package leetcode.easy;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {

  public List<Double> averageOfLevels(TreeNode root) {

    Queue<TreeNode> levelQueue = new LinkedList<>();
    levelQueue.add(root);
    levelQueue.add(null);

    List<Double> avgList = new ArrayList<>();

    while (levelQueue.peek() != null) {

      double sum = 0;
      int nodes = 0;

      while (levelQueue.peek() != null) {

        TreeNode node = levelQueue.poll();
        sum += node.val;
        nodes++;

        if (node.left != null) levelQueue.add(node.left);
        if (node.right != null) levelQueue.add(node.right);
      }

      levelQueue.add(levelQueue.poll());
      avgList.add(sum / nodes);
    }

    return avgList;
  }

}
