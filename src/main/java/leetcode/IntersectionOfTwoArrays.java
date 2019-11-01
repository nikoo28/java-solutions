package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nikoo28 on 12/17/17 3:03 PM
 */

class IntersectionOfTwoArrays {

  public int[] intersection(int[] nums1, int[] nums2) {

    Set<Integer> set1 = new HashSet<>();
    Set<Integer> result = new HashSet<>();

    for (int num : nums1) set1.add(num);
    for (int num : nums2) if (set1.contains(num)) result.add(num);

    int[] intersection = new int[result.size()];
    int idx = 0;
    for (Integer num : result) intersection[idx++] = num;

    return intersection;
  }

}
