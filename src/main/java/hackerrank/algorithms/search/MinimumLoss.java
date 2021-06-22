package hackerrank.algorithms.search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumLoss {

  public int minimumLoss(List<Long> prices) {

    // Copy all elements to an array
    long[] pricesArray = new long[prices.size()];

    // Index all the elements
    Map<Long, Integer> priceDayNumberMap = new HashMap<>();
    for (int i = 0; i < prices.size(); i++) {
      pricesArray[i] = prices.get(i);
      priceDayNumberMap.put(prices.get(i), i);
    }

    Arrays.sort(pricesArray);
    Long minimumLoss = Long.MAX_VALUE;

    // Start from the end
    for (int i = prices.size() - 1; i > 0 ; i--) {
      // Reject the invalid values 💣
      if (priceDayNumberMap.get(pricesArray[i]) > priceDayNumberMap.get(pricesArray[i-1]))
        continue;
      long dayLoss = pricesArray[i] - pricesArray[i-1];
      minimumLoss = Math.min(dayLoss, minimumLoss);
    }

    return minimumLoss.intValue();
  }

}
