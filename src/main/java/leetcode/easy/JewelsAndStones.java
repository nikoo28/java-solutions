package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

  int numJewelsInStones(String jewels, String stones) {

    // Create a set for all different jewels
    Set<Character> jewelSet = new HashSet<>();
    for (int i = 0; i < jewels.length(); i++)
      jewelSet.add(jewels.charAt(i));

    // Find total score/value
    int score = 0;
    for (int i = 0; i < stones.length(); i++)
      if (jewelSet.contains(stones.charAt(i)))
        score++;

    return score;
  }

}
