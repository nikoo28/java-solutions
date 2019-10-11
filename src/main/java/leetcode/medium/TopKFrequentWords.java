package leetcode.medium;

import java.util.*;

/**
 * Created by nikoo28 on 2019-09-14 17:18
 */

class TopKFrequentWords {

  public List<String> topKFrequent(String[] words, int k) {

    List<String> result = new LinkedList<>();
    Map<String, Integer> map = new HashMap<>();
    for (String word : words) {
      if (map.containsKey(word))
        map.put(word, map.get(word) + 1);
      else
        map.put(word, 1);
    }

    PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
        (a, b) ->
            a.getValue().equals(b.getValue())
                ? b.getKey().compareTo(a.getKey())
                : a.getValue() - b.getValue()
    );

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      pq.offer(entry);
      if (pq.size() > k)
        pq.poll();
    }

    while (!pq.isEmpty())
      result.add(0, pq.poll().getKey());

    return result;
  }

}
