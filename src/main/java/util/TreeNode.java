package util;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 */
public class TreeNode {

  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int x) {
    val = x;
    left = null;
    right = null;
  }

  public static void inOrderTraversal(TreeNode root) {

    // Terminating condition
    if (root == null)
      return;

    // Traverse the left node
    inOrderTraversal(root.left);

    // Print the root node
    System.out.print(root.val + " -> ");

    // Go to the right node
    inOrderTraversal(root.right);
  }

  public static void preOrderTraversal(TreeNode root) {

    // Terminating condition
    if (root == null)
      return;

    // Print the root node
    System.out.print(root.val + " -> ");

    // Traverse the left node
    preOrderTraversal(root.left);

    // Go to the right node
    preOrderTraversal(root.right);
  }

  public static void postOrderTraversal(TreeNode root) {

    // Terminating condition
    if (root == null)
      return;

    // Traverse the left node
    postOrderTraversal(root.left);

    // Go to the right node
    postOrderTraversal(root.right);

    // Print the root node
    System.out.print(root.val + " -> ");
  }

  public static void levelOrderTraversal(TreeNode root) {

    Queue<TreeNode> treeNodeQueue = new LinkedList<>();

    // Start with the first/root node
    treeNodeQueue.add(root);

    // Run a loop till this queue is not empty
    while (!treeNodeQueue.isEmpty()) {
      TreeNode treeNode = treeNodeQueue.poll();

      // Print the value
      System.out.print(treeNode.val + " -> ");

      // Add left child to queue
      if (treeNode.left != null)
        treeNodeQueue.add(treeNode.left);

      // Add right child to queue
      if (treeNode.right != null)
        treeNodeQueue.add(treeNode.right);
    }
  }

  public static void main(String[] args) {

    // Creating a tree that looks like
    //            2
    TreeNode root = new TreeNode(2);

    // Adding left and right child
    //            2
    //          /  \
    //        8     4
    root.left = new TreeNode(8);
    root.right = new TreeNode(4);

    TreeNode leftNode = root.left;
    TreeNode rightNode = root.right;

    // Adding more child to left node
    //            2
    //          /  \
    //        8     4
    //      /  \
    //     3   7
    leftNode.left = new TreeNode(3);
    leftNode.right = new TreeNode(7);

    // Adding child to right node
    //            2
    //          /  \
    //        8     4
    //      /  \     \
    //     3   7      1
    rightNode.right = new TreeNode(1);

    // Adding child to child of right node
    //            2
    //          /  \
    //        8     4
    //      /  \     \
    //     3   7      1
    //               /
    //              6
    rightNode.right.left = new TreeNode(6);

    // Will print 2
    System.out.println(root.val);

    // Will print 6
    System.out.println(root.right.right.left.val);

    System.out.println("\nIn-order traversal: ");
    inOrderTraversal(root);

    System.out.println("\nPre-order traversal: ");
    preOrderTraversal(root);

    System.out.println("\nPost-order traversal: ");
    postOrderTraversal(root);

    System.out.println("\nLevel order traversal: ");
    levelOrderTraversal(root);
  }
}
