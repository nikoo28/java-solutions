package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {

  int totalFruit(int[] fruits) {

    Map<Integer, Integer> basket = new HashMap<>();
    int left = 0;
    int right = 0;
    int maxFruits = 0;

    for (right = 0; right < fruits.length; right++) {
      // Add current to basket
      int currentCount = basket.getOrDefault(fruits[right], 0);
      basket.put(fruits[right], currentCount + 1);

      // If basket has more than 2 type of fruits,
      // start emptying the basket
      while (basket.size() > 2) {
        int fruitCount = basket.get(fruits[left]);
        if (fruitCount == 1)
          basket.remove(fruits[left]);
        else
          basket.put(fruits[left], fruitCount - 1);
        left++;
      }

      maxFruits = Math.max(maxFruits, right - left + 1);
    }
    return maxFruits;
  }

}
