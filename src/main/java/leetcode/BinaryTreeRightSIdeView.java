package leetcode;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by nikoo28 on 7/20/19 3:11 PM
 */

class BinaryTreeRightSIdeView {

  private List<Integer> rightSideView(TreeNode root) {

    if (root == null)
      return new ArrayList<>();

    Queue<TreeNode> queue = new LinkedList<>();
    List<Integer> result = new ArrayList<>();

    queue.add(root);
    queue.add(null);
    while (queue.peek() != null) {

      int size = queue.size();
      TreeNode prev = null;
      for (int q = 0; q < size; q++) {

        TreeNode node = queue.poll();
        if (node == null) {
          break;
        }
        if (node.left != null)
          queue.add(node.left);

        if (node.right != null)
          queue.add(node.right);

        prev = node;
      }
      result.add(prev.val);
      queue.add(null);
    }
    return result;
  }

  public static void main(String[] args) {

    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(5);
    root.right.right = new TreeNode(4);

    BinaryTreeRightSIdeView binaryTreeRightSideView = new BinaryTreeRightSIdeView();
    System.out.println(binaryTreeRightSideView.rightSideView(root));
  }

}
