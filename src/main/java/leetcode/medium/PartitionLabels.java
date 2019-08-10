package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikoo28 on 2019-07-20 22:41
 */

public class PartitionLabels {

  public List<Integer> partitionLabels(String S) {

    List<Integer> partitions = new ArrayList<>();

    for (int i = 0; i < S.length(); ) {

      int startIndex = i;
      int endIndex = S.lastIndexOf(S.charAt(startIndex));

      for (int s = startIndex + 1; s <= endIndex - 1; s++) {
        if (S.lastIndexOf(S.charAt(s)) > endIndex)
          endIndex = S.lastIndexOf(S.charAt(s));
      }

      partitions.add(endIndex - startIndex + 1);
      i = endIndex + 1;
    }


    return partitions;
  }

  public static void main(String[] args) {

    PartitionLabels partitionLabels = new PartitionLabels();
    System.out.println(partitionLabels.partitionLabels("ababcbacadefegdehijhklij"));
    System.out.println(partitionLabels.partitionLabels("abcaxdefgd"));
    System.out.println(partitionLabels.partitionLabels("qiejxqfnqceocmy"));

  }

}
