package leetcode.easy;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageOfLevelsInBinaryTreeTest {

  private final AverageOfLevelsInBinaryTree averageOfLevelsInBinaryTree;

  AverageOfLevelsInBinaryTreeTest() {
    averageOfLevelsInBinaryTree = new AverageOfLevelsInBinaryTree();
  }

  @Test
  void testAverageOfLevels1() {
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

    List<Double> result = new ArrayList<>();
    result.add(2.0);
    result.add(6.0);
    result.add(11.0/3.0);
    result.add(6.0);

    assertEquals(result, averageOfLevelsInBinaryTree.averageOfLevels(root));
  }

  @Test
  void testAverageOfLevels2() {

    TreeNode root = new TreeNode(2147483647);
    root.left = new TreeNode(2147483647);
    root.right = new TreeNode(2147483647);

    List<Double> result = new ArrayList<>();
    result.add(2147483647.0);
    result.add(2147483647.0);

    assertEquals(result, averageOfLevelsInBinaryTree.averageOfLevels(root));
  }
}