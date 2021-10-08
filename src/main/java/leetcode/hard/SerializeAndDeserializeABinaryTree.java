package leetcode.hard;

import util.TreeNode;

/**
 * Created by nikoo28 on 7/12/19 3:06 AM
 */

class SerializeAndDeserializeABinaryTree {

  // Encodes a tree to a single string.
  public String serialize(TreeNode root) {

    StringBuilder inOrderString = new StringBuilder();
    inOrder(root, inOrderString);

    StringBuilder preOrderString = new StringBuilder();
    preOrder(root, preOrderString);

    return inOrderString.toString() + preOrderString.toString();
  }

  private void inOrder(TreeNode root, StringBuilder inOrderString) {
    if (root == null)
      return;

    inOrder(root.left, inOrderString);
    inOrderString.append(root.val).append(":").append(root.hashCode()).append(",");
    inOrder(root.right, inOrderString);
  }

  private void preOrder(TreeNode root, StringBuilder preOrderString) {
    if (root == null)
      return;

    preOrderString.append(root.val).append(":").append(root.hashCode()).append(",");
    preOrder(root.left, preOrderString);
    preOrder(root.right, preOrderString);
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {

    if (data == null || data.length() == 0)
      return null;

    String inOrderString = data.substring(0, data.length() / 2);
    String[] inOrderSplits = inOrderString.split(",");

    String preOrderString = data.substring(data.length() / 2);
    String[] preOrderSplits = preOrderString.split(",");

    String rootValAddress = preOrderSplits[0];
    int rootVal = Integer.parseInt(rootValAddress.split(":")[0]);

    StringBuilder inOrderStringLeft = new StringBuilder();
    StringBuilder preOrderStringLeft = new StringBuilder();

    StringBuilder inOrderStringRight = new StringBuilder();
    StringBuilder preOrderStringRight = new StringBuilder();

    boolean left = true;
    int j = 1;
    for (String inOrderSplit : inOrderSplits) {

      if (inOrderSplit.equals(rootValAddress)) {
        left = false;
        continue;
      }

      if (left) {
        inOrderStringLeft.append(inOrderSplit).append(",");
        preOrderStringLeft.append(preOrderSplits[j++]).append(",");
      } else {
        inOrderStringRight.append(inOrderSplit).append(",");
        preOrderStringRight.append(preOrderSplits[j++]).append(",");
      }
    }

    String leftData = null, rightData = null;
    if (inOrderStringLeft.length() > 0) {
      leftData = inOrderStringLeft.toString() + preOrderStringLeft.toString();
    }

    if (inOrderStringRight.length() > 0) {
      rightData = inOrderStringRight.toString() + preOrderStringRight.toString();
    }

    TreeNode root = new TreeNode(rootVal);
    root.left = deserialize(leftData);
    root.right = deserialize(rightData);

    return root;
  }
}
