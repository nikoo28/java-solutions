package leetcode.hard;

import util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 2019-09-14 18:59
 */

class SerializeAndDeserializeABinaryTreeTest {

  private SerializeAndDeserializeABinaryTree serializeAndDeserializeABinaryTree =
      new SerializeAndDeserializeABinaryTree();

  @Test
  void testSerializeAndDeserialize1() {
    TreeNode root = new TreeNode(1);

    root.left = new TreeNode(1);
    root.left.left = new TreeNode(4);
    root.left.left.right = new TreeNode(7);

    root.right = new TreeNode(3);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(6);

    String data = serializeAndDeserializeABinaryTree.serialize(root);
    // System.out.println(data);

    TreeNode deserialized = serializeAndDeserializeABinaryTree.deserialize(data);
    assertEquals(1, deserialized.val);

    assertEquals(1, deserialized.left.val);
    assertEquals(4, deserialized.left.left.val);
    assertEquals(7, deserialized.left.left.right.val);

    assertEquals(3, deserialized.right.val);
    assertEquals(5, deserialized.right.left.val);
    assertEquals(6, deserialized.right.right.val);
  }

  @Test
  void testSerializeAndDeserialize2() {
    TreeNode root = new TreeNode(1);

    root.left = new TreeNode(2);

    root.right = new TreeNode(3);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(5);

    String data = serializeAndDeserializeABinaryTree.serialize(root);
    // System.out.println(data);

    TreeNode deserialized = serializeAndDeserializeABinaryTree.deserialize(data);
    assertEquals(1, deserialized.val);

    assertEquals(2, deserialized.left.val);

    assertEquals(3, deserialized.right.val);
    assertEquals(4, deserialized.right.left.val);
    assertEquals(5, deserialized.right.right.val);
  }
}
