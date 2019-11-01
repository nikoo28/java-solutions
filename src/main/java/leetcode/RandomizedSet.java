package leetcode;

import java.util.*;

/**
 * Created by nikoo28 on 7/18/19 2:03 AM
 */

class RandomizedSet {

  private Map<Integer, Integer> valueValueMap;

  /**
   * Initialize your data structure here.
   */
  public RandomizedSet() {
    valueValueMap = new HashMap<>();
  }

  /**
   * Inserts a value to the set. Returns true if the set did not already contain the specified element.
   */
  public boolean insert(int val) {

    if (valueValueMap.containsKey(val))
      return false;

    valueValueMap.put(val, val);
    return true;
  }

  /**
   * Removes a value from the set. Returns true if the set contained the specified element.
   */
  public boolean remove(int val) {

    if (valueValueMap.containsKey(val)) {
      valueValueMap.remove(val);
      return true;
    }

    return false;
  }

  /**
   * Get a random element from the set.
   */
  public int getRandom() {

    int rand = (int) (Math.random() * ((valueValueMap.size() - 1) + 1));
    int i = 0;
    for (Map.Entry<Integer, Integer> integerIntegerEntry : valueValueMap.entrySet()) {
      if (i == rand)
        return integerIntegerEntry.getKey();

      i++;
    }

    return 0;
  }

}
