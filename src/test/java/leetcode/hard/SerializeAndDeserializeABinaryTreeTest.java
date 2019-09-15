package leetcode.hard;

import leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nikoo28 on 2019-09-14 18:59
 */

public class SerializeAndDeserializeABinaryTreeTest {

  private SerializeAndDeserializeABinaryTree serializeAndDeserializeABinaryTree =
      new SerializeAndDeserializeABinaryTree();

  @Test
  public void testSerializeAndDeserialize1() {
    TreeNode root = new TreeNode(1);

    root.left = new TreeNode(1);
    root.left.left = new TreeNode(4);
    root.left.left.right = new TreeNode(7);

    root.right = new TreeNode(3);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(6);

    String data = serializeAndDeserializeABinaryTree.serialize(root);
    System.out.println(data);

    TreeNode deserialized = serializeAndDeserializeABinaryTree.deserialize(data);
    Assert.assertEquals(1, deserialized.val);

    Assert.assertEquals(1, deserialized.left.val);
    Assert.assertEquals(4, deserialized.left.left.val);
    Assert.assertEquals(7, deserialized.left.left.right.val);

    Assert.assertEquals(3, deserialized.right.val);
    Assert.assertEquals(5, deserialized.right.left.val);
    Assert.assertEquals(6, deserialized.right.right.val);
  }

  @Test
  public void testSerializeAndDeserialize2() {
    TreeNode root = new TreeNode(1);

    root.left = new TreeNode(2);

    root.right = new TreeNode(3);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(5);

    String data = serializeAndDeserializeABinaryTree.serialize(root);
    System.out.println(data);

    TreeNode deserialized = serializeAndDeserializeABinaryTree.deserialize(data);
    Assert.assertEquals(1, deserialized.val);

    Assert.assertEquals(2, deserialized.left.val);

    Assert.assertEquals(3, deserialized.right.val);
    Assert.assertEquals(4, deserialized.right.left.val);
    Assert.assertEquals(5, deserialized.right.right.val);
  }
}
