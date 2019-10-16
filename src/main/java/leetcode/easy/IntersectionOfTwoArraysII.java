package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by nikoo28 on 10/15/19 11:59 PM
 */

class IntersectionOfTwoArraysII {

  int[] intersect(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> map = new HashMap<>();
    ArrayList<Integer> result = new ArrayList<>();

    for (int value : nums1) {
      if (map.containsKey(value))
        map.put(value, map.get(value) + 1);
      else
        map.put(value, 1);
    }

    for (int value : nums2) {
      if (map.containsKey(value) && map.get(value) > 0) {
        result.add(value);
        map.put(value, map.get(value) - 1);
      }
    }

    int[] r = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
      r[i] = result.get(i);
    }

    return r;
  }

}
