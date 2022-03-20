package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartitionLabelsTest {

  private final PartitionLabels partitionLabels;

  PartitionLabelsTest() {
    partitionLabels = new PartitionLabels();
  }

  @Test
  void testPartitionLabels1() {
    String str = "ababcbacadefegdehijhklij";

    List<Integer> result = new ArrayList<>();
    result.add(9);
    result.add(7);
    result.add(8);

    List<Integer> actualList = partitionLabels.partitionLabels(str);
    assertEquals(result, actualList);
  }

  @Test
  void testPartitionLabels2() {
    String str = "abcaxdefgd";

    List<Integer> result = new ArrayList<>();
    result.add(4);
    result.add(1);
    result.add(5);

    List<Integer> actualList = partitionLabels.partitionLabels(str);
    assertEquals(result, actualList);
  }

  @Test
  void testPartitionLabels3() {
    String str = "qiejxqfnqceocmy";

    List<Integer> result = new ArrayList<>();
    result.add(13);
    result.add(1);
    result.add(1);

    List<Integer> actualList = partitionLabels.partitionLabels(str);
    assertEquals(result, actualList);
  }
}