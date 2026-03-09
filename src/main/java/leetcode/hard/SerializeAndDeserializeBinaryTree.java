package leetcode.hard;

import util.TreeNode;

import java.util.*;

public class SerializeAndDeserializeBinaryTree {

  // Encodes a tree to a single string using level-order traversal.
  String serialize(TreeNode root) {
    if (root == null) return "";

    StringBuilder sb = new StringBuilder();
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);

    while (!q.isEmpty()) {
      TreeNode node = q.poll();
      if (sb.length() > 0) sb.append(',');
      if (node == null) {
        sb.append('n');
      } else {
        sb.append(node.val);
        q.offer(node.left);
        q.offer(node.right);
      }
    }

    return sb.toString();
  }

  // Decodes your encoded data to tree.
  TreeNode deserialize(String data) {
    if (data == null || data.isEmpty()) return null;

    String[] parts = data.split(",");
    if (parts.length == 0 || parts[0].equals("n")) return null;

    TreeNode root = new TreeNode(Integer.parseInt(parts[0]));
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);

    int i = 1;
    while (!q.isEmpty() && i < parts.length) {
      TreeNode parent = q.poll();

      // Left child
      if (i < parts.length && !parts[i].equals("n")) {
        TreeNode left = new TreeNode(Integer.parseInt(parts[i]));
        parent.left = left;
        q.offer(left);
      }
      i++;

      // Right child
      if (i < parts.length && !parts[i].equals("n")) {
        TreeNode right = new TreeNode(Integer.parseInt(parts[i]));
        parent.right = right;
        q.offer(right);
      }
      i++;
    }

    return root;
  }

}
