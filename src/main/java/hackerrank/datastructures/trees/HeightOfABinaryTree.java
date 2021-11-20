package hackerrank.datastructures.trees;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by nikoo28 on 11/19/21 8:46 PM
 */

public class HeightOfABinaryTree {

  int height(TreeNode root) {

    Queue<TreeNode> elementQueue = new LinkedList<>();

    elementQueue.add(root);
    int numberOfLevels = -1;

    while (true) {

      // Maintain a count of nodes at each level
      int nodeCountAtLevel = elementQueue.size();
      if (nodeCountAtLevel == 0) {
        // If we find no nodes at level, it means tree has ended, so return
        return numberOfLevels;
      }

      // Deque all the nodes present a particular level and add it to queue
      while (nodeCountAtLevel > 0) {
        TreeNode element = elementQueue.poll();
        if (element.left != null)
          elementQueue.add(element.left);
        if (element.right != null)
          elementQueue.add(element.right);
        nodeCountAtLevel--;
      }

      numberOfLevels++;
    }
  }
}
