package util;

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

  public static void main(String[] args) {

    TreeNode root = new TreeNode(4);

    root.left = new TreeNode(8);
    root.right = new TreeNode(15);

    TreeNode leftNode = root.left;
    TreeNode rightNode = root.right;

    leftNode.left = new TreeNode(16);

    rightNode.left = new TreeNode(23);
    rightNode.right = new TreeNode(42);

    // Will print 4
    System.out.println(root.val);

    // Will print 23
    System.out.println(root.right.left.val);
  }
}
