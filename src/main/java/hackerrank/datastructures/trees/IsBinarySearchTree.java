package hackerrank.datastructures.trees;

import util.TreeNode;

import java.util.LinkedList;
import java.util.List;

// Works in JAVA 7 on HackerRank

public class IsBinarySearchTree {

  boolean checkBST(TreeNode root) {

    List<Integer> inOrderList = new LinkedList<>();

    // Populate the list
    helper(root, inOrderList);

    boolean isBST = true;
    int prev = inOrderList.get(0);
    for (int i = 1; i < inOrderList.size(); i++) {

      // Check if new element is smaller than previous element
      // or if the element is duplicate
      if (inOrderList.get(i) <= prev)
        isBST = false;

      prev = inOrderList.get(i);
    }

    return isBST;
  }

  void helper(TreeNode treeNode, List<Integer> inOrderList) {
    if (treeNode == null)
      return;

    helper(treeNode.left, inOrderList);
    inOrderList.add(treeNode.val);
    helper(treeNode.right, inOrderList);
  }

}
