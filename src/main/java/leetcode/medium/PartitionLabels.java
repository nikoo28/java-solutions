package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikoo28 on 2019-07-20 22:41.
 */

class PartitionLabels {

  public List<Integer> partitionLabels(String str) {

    List<Integer> partitions = new ArrayList<>();

    for (int i = 0; i < str.length(); ) {

      // Get first and last index of first character
      int startIndex = i;
      int endIndex = str.lastIndexOf(str.charAt(startIndex));

      for (int s = startIndex + 1; s <= endIndex - 1; s++) {

        // Find last index of any subsequent characters
        int lastIndexOfNextChar = str.lastIndexOf(str.charAt(s));

        if (lastIndexOfNextChar > endIndex) {
          // Update endIndex if required
          endIndex = lastIndexOfNextChar;
        }
      }

      partitions.add(endIndex - startIndex + 1);
      i = endIndex + 1;
    }

    return partitions;
  }
}
