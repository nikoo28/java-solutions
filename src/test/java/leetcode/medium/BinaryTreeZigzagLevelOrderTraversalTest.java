package leetcode.medium;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeZigzagLevelOrderTraversalTest {

  private final BinaryTreeZigzagLevelOrderTraversal binaryTreeZigzagLevelOrderTraversal;

  BinaryTreeZigzagLevelOrderTraversalTest() {
    binaryTreeZigzagLevelOrderTraversal = new BinaryTreeZigzagLevelOrderTraversal();
  }

  @Test
  void testZigzagLevelOrder1() {
    // Creating a tree that looks like
    //            10
    TreeNode root = new TreeNode(10);

    // Adding left and right child
    //            10
    //          /   \
    //        5      15
    root.left = new TreeNode(5);
    root.right = new TreeNode(15);

    TreeNode leftNode = root.left;
    TreeNode rightNode = root.right;

    // Adding more child to left node
    //            10
    //          /   \
    //        5      15
    //      /  \
    //     3   7
    leftNode.left = new TreeNode(3);
    leftNode.right = new TreeNode(7);

    // Adding child to right node
    //            10
    //          /   \
    //        5     15
    //      /  \      \
    //     3   7      18
    rightNode.right = new TreeNode(18);

    //            10
    //          /   \
    //        5     15
    //      /  \      \
    //     3   7      18
    //               /
    //              16
    rightNode.right.left = new TreeNode(16);

    List<Integer> level0 = new ArrayList<>();
    level0.add(10);

    List<Integer> level1 = new ArrayList<>();
    level1.add(15);
    level1.add(5);

    List<Integer> level2 = new ArrayList<>();
    level2.add(3);
    level2.add(7);
    level2.add(18);

    List<Integer> level3 = new ArrayList<>();
    level3.add(16);

    List<List<Integer>> zigzagLevelOrder = binaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root);

    assertEquals(level0, zigzagLevelOrder.get(0));
    assertEquals(level1, zigzagLevelOrder.get(1));
    assertEquals(level2, zigzagLevelOrder.get(2));
    assertEquals(level3, zigzagLevelOrder.get(3));
  }

  @Test
  void testZigzagLevelOrder2() {
    TreeNode root = null;

    List<List<Integer>> zigzagLevelOrder = binaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root);

    assertEquals(0, zigzagLevelOrder.size());
  }
}