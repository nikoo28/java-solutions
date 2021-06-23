package hackerrank.algorithms.search;

import java.util.*;

public class MinimumLoss {

  public int minimumLoss(List<Long> prices) {

    // Index all the elements
    Map<Long, Integer> priceIndexMap = new HashMap<>();
    for (int i = 0; i < prices.size(); i++) {
      priceIndexMap.put(prices.get(i), i);
    }

    Collections.sort(prices);
    long minimumLoss = Long.MAX_VALUE;

    // Start from the end
    for (int i = prices.size() - 1; i > 0 ; i--) {

      // Reject the invalid values 💣
      if (priceIndexMap.get(prices.get(i)) >
          priceIndexMap.get(prices.get(i-1)))
        continue;

      long dayLoss = prices.get(i) - prices.get(i-1);
      minimumLoss = Math.min(dayLoss, minimumLoss);
    }

    return (int) minimumLoss;
  }

}
